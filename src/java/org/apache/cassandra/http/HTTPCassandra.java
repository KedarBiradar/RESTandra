/**
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package org.apache.cassandra.http;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.List;
import java.util.regex.Pattern;
import java.util.Calendar;
import org.apache.commons.lang.StringUtils;


import org.apache.cassandra.thrift.Cassandra;
import org.apache.cassandra.thrift.Column;
import org.apache.cassandra.thrift.ColumnOrSuperColumn;
import org.apache.cassandra.thrift.ColumnParent;
import org.apache.cassandra.thrift.ColumnPath;
import org.apache.cassandra.thrift.ConsistencyLevel;
import org.apache.cassandra.thrift.SlicePredicate;
import org.apache.cassandra.thrift.SliceRange;
import org.apache.cassandra.thrift.TimedOutException;
import org.apache.cassandra.thrift.UnavailableException;
import org.apache.thrift.TException;
import org.apache.cassandra.thrift.InvalidRequestException;
import org.apache.cassandra.thrift.NotFoundException;

import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import org.apache.log4j.Logger;

import org.slf4j.LoggerFactory;
import static org.apache.cassandra.utils.FBUtilities.bytesToHex;

public class HTTPCassandra {

    private static final Logger logger = Logger.getLogger(HTTPCassandra.class);
    private static final String UTF8 = "UTF8";
    Calendar now = Calendar.getInstance();


    private static final String HOST = "localhost";
    private static final int PORT = 9160;
    private static final ConsistencyLevel CL = ConsistencyLevel.ONE;

	public String[] handleGET(String[] query)
	{
        String keyspace = query[1];
        String colFam = query[2];
        String key = query[3];
        String superColumn = query[4];
        String startColumn = query[5];
        String endColumn = query[6];
        String type  = query[7].trim().replace(".", "");// TODO: change to include consistency level

        if(keyspace.equals("") && colFam.equals("") && key.equals(""))
		{
            //Send Error, required parts of query not set
            String[] eRet = new String[2];
            eRet[0] = "400";
            eRet[1] = "Bad Request: Incomplete query";
            return eRet;
        }
        else
        {
            if(superColumn.equals(""))
            {
                //Normal Row
                if((type.equalsIgnoreCase("json")) || (type.equalsIgnoreCase("xml")) || (type.equalsIgnoreCase("plain")))
				{
                    //MIME types
                    if((type.equalsIgnoreCase("json")))
                    {
                        type = "application/" + type;
                    }
                    else
                    {
                        type = "text/" + type;
                    }

                    TTransport tr = new TSocket(HOST, PORT);
                    TFramedTransport tf = new TFramedTransport(tr);
                    TProtocol proto = new TBinaryProtocol(tf);
                    Cassandra.Client client = new Cassandra.Client(proto);
                    String retData = "";

                    try
                    {
                        tf.open();
                        client.set_keyspace(keyspace);
                        String cfName = colFam;
                        byte[] userIDKey = key.getBytes();
                        SlicePredicate predicate = new SlicePredicate();
                        SliceRange sliceRange = new SliceRange();

                        if((!startColumn.equals("")) && (!endColumn.equals("")))
                        {
                            //todo: fix slice bug
                            byte[] sCol = startColumn.getBytes();
                            byte[] eCol = endColumn.getBytes();
                            sliceRange.setStart(startColumn.getBytes(UTF8));
                            sliceRange.setFinish(endColumn.getBytes(UTF8));
                            System.out.println("SET");
                        }
                        else
                        {
                            //If the client hasnt set both start and end, default to whole row
                            sliceRange.setStart(new byte[0]);
                            sliceRange.setFinish(new byte[0]);
                        }
                        predicate.setSlice_range(sliceRange);
                        ColumnParent parent = new ColumnParent(cfName);
                        List<ColumnOrSuperColumn> results = client.get_slice(ByteBuffer.wrap(userIDKey), parent, predicate, CL);
                        tf.close();
                        try
                        {
                            if((type.equalsIgnoreCase("application/json")))
                            {
                                retData = toJSON(results, key);
                            }
                            else if((type.equalsIgnoreCase("text/xml")))
                            {
                                retData = toXML(results, key);
                            }
                            else
                            {
                                CharBuffer cbuf;
                                for (ColumnOrSuperColumn result : results)
                                {
                                    Column column = result.column;
                                    Charset charset = Charset.forName("UTF8");
                                    CharsetDecoder decoder = charset.newDecoder();
                                    cbuf = decoder.decode(column.name);
                                    retData += "Key: " + cbuf.toString()  + " ";
                                    cbuf = decoder.decode(column.value);
                                    retData += "Value: " + cbuf.toString() + "<br /> \n";
                                }
                            }
                            if(retData.equals(""))
                            {
                                String[] eRet = new String[2];
                                eRet[0] = "404";
                                eRet[1] = "Row Not Found";
                                return eRet;
                            }
                            else
                            {
                                String[] wholeRowRet = new String[3];
                                wholeRowRet[0] = "200";
                                wholeRowRet[1] = retData;
                                wholeRowRet[2] = type;
                                return wholeRowRet;
                            }
                        }
                        catch (Exception ex)
                        {
                            System.out.println(ex.getMessage());

                            String[] eRet = new String[2];
                            eRet[0] = "400";
                            eRet[1] = "Bad Request " + ex.getMessage();
                            return eRet;
                        }
                    }
                    catch(Exception ex)
                    {
                       logger.error(ex.getMessage(), ex);
                       System.out.println(ex.getMessage());

                        System.out.println(ex.getMessage());
                        tf.close();
                        String[] eRet = new String[2];
                        eRet[0] = "400";
                        eRet[1] = "Bad Request " + ex.getMessage();
                        return eRet;
                    }
                }
                else
                {
                    String[] eRet = new String[2];
                    eRet[0] = "400";
                    eRet[1] = "Bad Request Invalid Return Type";
                    return eRet;
                }
            }
            else
            {
               //todo: Super Cols
            }
        }
        String[] eRet = new String[2];
        eRet[0] = "500";
        eRet[1] = "Server Error";
        return eRet;
    }



	public String[] handlePOST(String[] query, String[] vars)
	{

		System.out.println("Stuffs: " + query[1] + " " + vars[0]);


        TestClass test = new TestClass();

        try
        {
            TTransport tr = new TSocket(HOST, PORT);
            TFramedTransport tf = new TFramedTransport(tr);
            TProtocol proto = new TBinaryProtocol(tf);

            Cassandra.Client client = new Cassandra.Client(proto);

            String keyspace = query[1];
            String colFam = query[2];
            String key = query[3];

            tf.open();
            client.set_keyspace(keyspace);
            String cfName = colFam;
            byte[] userIDKey = key.getBytes();

            Long clock;
            ColumnParent cp = new ColumnParent(cfName);


           for(String var:vars)
           {
               String[] keyval = var.split("=");
               clock = now.getTimeInMillis();
               client.insert(ByteBuffer.wrap(userIDKey), cp,  new Column(ByteBuffer.wrap(keyval[0].getBytes(UTF8)),  ByteBuffer.wrap(keyval[1].getBytes()), clock), CL);

               System.out.print("added: " + keyval[0] + " : " + keyval[1] );

           }
           System.out.println("");
           tf.close();
        }
        catch (Exception ex)
        {

            logger.error(ex.getMessage(), ex);
        }


		String[] ret = new String[2];
		ret[0] = "201";
		ret[1] = "Created";
		return ret;
	}

    private String toJSON(List<ColumnOrSuperColumn> results, String key)
    {
        CharBuffer cbuf;

        String name, val;
        String json = "{\""+ key +"\": {";
        boolean first = true;

        Charset charset = Charset.forName("UTF8");
        CharsetDecoder decoder = charset.newDecoder();

        for (ColumnOrSuperColumn result : results)
        {
            Column column = result.column;

                try
                {
                    name = decoder.decode(column.name).toString();
                    val = decoder.decode(column.value).toString();

                    name = StringUtils.replace(name, "\"", "\\\"");
                    val = StringUtils.replace(val, "\"", "\\\"");

                    if(first)
                    {
                        json += "\""+name+" \": ";
                        json += "\"" +val+ "\"";
                        first = false;
                    }
                    else
                    {
                        json += ", ";
                        json += "\""+name+" \": ";
                        json += "\"" +val+ "\"";
                    }
                }
                catch (CharacterCodingException e)
                {
                    //todo: error handling
                    e.printStackTrace();
                }
        }

        json += "}}";
        //json.replaceAll("\"", "\\\"" );
        return json;
    }

    private String toXML(List<ColumnOrSuperColumn> results, String key)
    {
        CharBuffer cbuf;

        String name, val;
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>";
        xml += "<"+ key +">";

        boolean first = true;

        Charset charset = Charset.forName("UTF8");

        CharsetDecoder decoder = charset.newDecoder();

        for (ColumnOrSuperColumn result : results)
        {
            Column column = result.column;

                try
                {
                    name = decoder.decode(column.name).toString();
                    val = decoder.decode(column.value).toString();

                    //name = StringUtils.replace(name, "\"", "\\\"");
                    //val = StringUtils.replace(val, "\"", "\\\"");
                    name = java.net.URLEncoder.encode(name, "ISO-8859-1");
                    val = java.net.URLEncoder.encode(val, "ISO-8859-1");



                    xml += "<"+name+">" + val + "</"+name+">";

                }
                catch (CharacterCodingException e)
                {
                    //todo: error handling
                    e.printStackTrace();
                }
                catch (UnsupportedEncodingException e)
                {
                    e.printStackTrace();
                }
        }


        xml += "</"+ key +">";
        return xml;
    }

}