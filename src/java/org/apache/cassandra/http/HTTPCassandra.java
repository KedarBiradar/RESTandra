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

import org.apache.thrift.transport.TTransportException;
import org.slf4j.LoggerFactory;
import static org.apache.cassandra.utils.FBUtilities.bytesToHex;

public class HTTPCassandra {

    private static final Logger logger = Logger.getLogger(HTTPCassandra.class);
    private static final String UTF8 = "UTF8";
    Calendar now = Calendar.getInstance();
    private static final String HOST = "localhost";
    private static final int PORT = 9160;
    //private static final ConsistencyLevel CL = ConsistencyLevel.ONE;

	public String[] handleGET(String[] query)
	{
        String keyspace = query[1];
        String colFam = query[2];
        String key = query[3];
        String superColumn = query[4];
        String startColumn = query[5];
        String endColumn = query[6];


        String[] consistencyLevelReturnType = StringUtils.split(query[7], ".");
        String type  = consistencyLevelReturnType[1];
        ConsistencyLevel CL = ConsistencyLevel.valueOf(consistencyLevelReturnType[0]);

        TTransport tr = new TSocket(HOST, PORT);
        TFramedTransport tf = new TFramedTransport(tr);
        TProtocol proto = new TBinaryProtocol(tf);
        Cassandra.Client client = new Cassandra.Client(proto);
        String retData = "";

        try
        {
            tf.open();
            client.set_keyspace(keyspace);
            byte[] userIDKey = key.getBytes();
            ColumnParent parent = new ColumnParent(colFam);

            SlicePredicate predicate = new SlicePredicate();
            SliceRange sliceRange = new SliceRange();
            sliceRange.setStart(startColumn.getBytes(UTF8));
            sliceRange.setFinish(endColumn.getBytes(UTF8));
            predicate.setSlice_range(sliceRange);
            List<ColumnOrSuperColumn> results = client.get_slice(ByteBuffer.wrap(userIDKey), parent, predicate, CL);

            //create return data
            if((type.equalsIgnoreCase("json")))
            {

                retData = toJSON(results, key);
                type = "application/json";
            }
            else if((type.equalsIgnoreCase("xml")))
            {

                retData = toXML(results, key);
                type = "text/xml";
            }
            else if ((type.equalsIgnoreCase("plain")))
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
                    retData += "Value: " + cbuf.toString() + " \n";
                }
                type = "text/plain";
            }

            tf.close();
        }
        catch (Exception e)
        {
            String[] eRet = new String[2];
            if(e instanceof InvalidRequestException)
            {
                //keyspace or col fam might not exist
                eRet[0] = "400";
                eRet[1] = "Client Request error"; //todo: query inspection
            }
            else if(e instanceof UnavailableException)
            {
                eRet[0] = "503";
                eRet[1] = "Service Unavailable";
            }
            else if(e instanceof TimedOutException)
            {
                //not the best fit as 4xx codes are client errors, but this isnt a strict http implementation
                eRet[0] = "408";
                eRet[1] = "Request Timeout - Valid query try again later";
            }
            else
            {
                eRet[0] = "500";
                eRet[1] = "Internal Server Error";
            }
            return eRet;
        }
        //send return headers
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

	public String[] handlePOST(String[] query, String[] vars)
	{


        try
        {
            TTransport tr = new TSocket(HOST, PORT);
            TFramedTransport tf = new TFramedTransport(tr);
            TProtocol proto = new TBinaryProtocol(tf);
            Cassandra.Client client = new Cassandra.Client(proto);
            tf.open();

            client.set_keyspace(query[1]);
            ColumnParent cp = new ColumnParent(query[2]);
            byte[] userIDKey = query[3].getBytes();
            ConsistencyLevel CL = ConsistencyLevel.valueOf(query[7]);

            Long clock;

           for(String var:vars)
           {
               var = java.net.URLDecoder.decode(var, "ISO-8859-1");
               String[] keyval = var.split("=");
               clock = now.getTimeInMillis();
               client.insert(ByteBuffer.wrap(userIDKey), cp,  new Column(ByteBuffer.wrap(keyval[0].getBytes(UTF8)),  ByteBuffer.wrap(keyval[1].getBytes()), clock), CL);
           }
           System.out.println("");
           tf.close();
        }
         catch (Exception e)
        {
            String[] eRet = new String[2];
            if(e instanceof InvalidRequestException)
            {
                //keyspace or col fam might not exist
                //see wiki discussion
                eRet[0] = "400";
                eRet[1] = "Client Request error"; //todo: query inspection
            }
            else if(e instanceof UnavailableException)
            {
                eRet[0] = "503";
                eRet[1] = "Service Unavailable";
            }
            else if(e instanceof TimedOutException)
            {
                //not the best fit as 4xx codes are client errors, but this isnt a strict http implementation
                eRet[0] = "408";
                eRet[1] = "Request Timeout - Valid query try again later";
            }
            else
            {
                eRet[0] = "500";
                eRet[1] = "Internal Server Error";
            }
            return eRet;
        }

        String[] ret = new String[2];
		ret[0] = "201";
		ret[1] = "Created";
		return ret;
	}

    public String[] handleDELETE(String[] query)
    {
        String keyspace = query[1];
        String colFam = query[2];
        String key = query[3];
        String superColumn = query[4];
        String startColumn = query[5];
        String endColumn = query[6];
        ConsistencyLevel CL = ConsistencyLevel.valueOf(query[7]);

        TTransport tr = new TSocket(HOST, PORT);
        TFramedTransport tf = new TFramedTransport(tr);
        TProtocol proto = new TBinaryProtocol(tf);
        Cassandra.Client client = new Cassandra.Client(proto);
        String retData = "";
        long timestamp = 0;

        try
        {
            tf.open();
            client.set_keyspace(keyspace);
            byte[] userIDKey = key.getBytes();
            ColumnParent parent = new ColumnParent(colFam);

            SlicePredicate predicate = new SlicePredicate();
            SliceRange sliceRange = new SliceRange();
            sliceRange.setStart(startColumn.getBytes(UTF8));
            sliceRange.setFinish(endColumn.getBytes(UTF8));
            predicate.setSlice_range(sliceRange);
            List<ColumnOrSuperColumn> results = client.get_slice(ByteBuffer.wrap(userIDKey), parent, predicate, CL);
            //doesnt need to loop over all
            for (ColumnOrSuperColumn result : results)
            {
                timestamp = result.column.getTimestamp();
            }

            ColumnPath colPath = new ColumnPath(colFam);
            client.remove(ByteBuffer.wrap(userIDKey), colPath, timestamp, ConsistencyLevel.ONE);
            System.out.println("del");
            tf.close();
        }
        catch (Exception e)
        {
            String[] eRet = new String[2];
            if(e instanceof InvalidRequestException)
            {
                //keyspace or col fam might not exist
                eRet[0] = "400";
                eRet[1] = "Client Request error"; //todo: query inspection
            }
            else if(e instanceof UnavailableException)
            {
                eRet[0] = "503";
                eRet[1] = "Service Unavailable";
            }
            else if(e instanceof TimedOutException)
            {
                //not the best fit as 4xx codes are client errors, but this isnt a strict http implementation
                eRet[0] = "408";
                eRet[1] = "Request Timeout - Valid query try again later";
            }
            else
            {
                eRet[0] = "500";
                eRet[1] = "Internal Server Error";
            }
            return eRet;
        }
        String[] ret = new String[2];
		ret[0] = "201";
		ret[1] = "Created";
		return ret;

    }

    private String toJSON(List<ColumnOrSuperColumn> results, String key)
    {
        String name, val;
        String json="";
        boolean first = true;
        Charset charset = Charset.forName("UTF8");  //Todo: address data type- wont always be UTF8 string
        CharsetDecoder decoder = charset.newDecoder();

        for (ColumnOrSuperColumn result : results)
        {
            Column column = result.column;
            try
            {
                name = decoder.decode(column.name).toString();
                val = decoder.decode(column.value).toString();

                if(!name.equalsIgnoreCase("") && !val.equalsIgnoreCase(""))
                {
                    name = StringUtils.replace(name, "\"", "\\\"");
                    val = StringUtils.replace(val, "\"", "\\\"");

                    if(first)
                    {
                        json = "{\""+ key +"\": {";
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
            }
            catch (CharacterCodingException e)
            {
                //todo: error handling
                e.printStackTrace();
            }
        }
        if(!json.equals(""))
        {
            json += "}}";
        }
        return json;
    }

    private String toXML(List<ColumnOrSuperColumn> results, String key)
    {
        String name, val;
        String xml = "";

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
                if(!name.equalsIgnoreCase("") && !val.equalsIgnoreCase(""))
                {
                    if(first)
                    {
                        first = false;
                        key = java.net.URLEncoder.encode(key, "ISO-8859-1");
                        xml += "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><"+ key +">";
                    }
                    name = java.net.URLEncoder.encode(name, "ISO-8859-1");
                    val = java.net.URLEncoder.encode(val, "ISO-8859-1");
                    xml += "<"+name+">" + val + "</"+name+">";
                }

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

        if(!xml.equals(""))
        {
            xml += "</"+ key +">";
        }
        return xml;
    }
}