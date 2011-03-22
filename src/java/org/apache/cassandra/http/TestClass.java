package org.apache.cassandra.http;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.List;
import org.apache.cassandra.thrift.Cassandra;
//import org.apache.cassandra.thrift.Clock;
import org.apache.cassandra.thrift.Column;
import org.apache.cassandra.thrift.ColumnOrSuperColumn;
import org.apache.cassandra.thrift.ColumnParent;
import org.apache.cassandra.thrift.ColumnPath;
import org.apache.cassandra.thrift.ConsistencyLevel;
import org.apache.cassandra.thrift.InvalidRequestException;
import org.apache.cassandra.thrift.NotFoundException;
import org.apache.cassandra.thrift.SlicePredicate;
import org.apache.cassandra.thrift.SliceRange;
import org.apache.cassandra.thrift.TimedOutException;
import org.apache.cassandra.thrift.UnavailableException;
import org.apache.log4j.Logger;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import java.util.Calendar;


public class TestClass {

private static final Logger LOG = Logger.getLogger(TestClass.class);
//set up some constants

private static final String UTF8 = "UTF8";
private static final String HOST = "localhost";
private static final int PORT = 9160;
private static final ConsistencyLevel CL = ConsistencyLevel.ONE;

//not paying attention to exceptions here
public void test() throws UnsupportedEncodingException,
InvalidRequestException, UnavailableException, TimedOutException, TException, NotFoundException {

TTransport tr = new TSocket(HOST, PORT);	 //new default in 0.7 is framed transport	 
TFramedTransport tf = new TFramedTransport(tr);	 
TProtocol proto = new TBinaryProtocol(tf);

Cassandra.Client client = new Cassandra.Client(proto);

    tf.open();
client.set_keyspace("Twissandra");
String cfName = "User";
byte[] userIDKey = "allinson1".getBytes(); //this is a row key

//Clock clock = new Clock(System.currentTimeMillis());
Calendar now = Calendar.getInstance();
Long clock = now.getTimeInMillis();


//create a representation of the Name column	 
ColumnPath colPathName = new ColumnPath(cfName); 
colPathName.setColumn("name".getBytes(UTF8));	 
ColumnParent cp = new ColumnParent(cfName);

//insert the name column	 
System.out.println("Inserting row for key " + new String(userIDKey));


Column colT = new Column(ByteBuffer.wrap("name".getBytes(UTF8)),  ByteBuffer.wrap("Lindsay".getBytes()), clock);

client.insert(ByteBuffer.wrap(userIDKey), cp, colT , CL);

//insert the Age column 
client.insert(ByteBuffer.wrap(userIDKey), cp,  new Column(ByteBuffer.wrap("age".getBytes(UTF8)),  ByteBuffer.wrap("22".getBytes()), clock), CL);

 System.out.println("Row insert done.");

// read just the Name column	 
System.out.println("Reading Name Column:");
Column col = client.get(ByteBuffer.wrap(userIDKey), colPathName, CL).getColumn();

byte[] nameByteArray = new byte[col.name.capacity()];

System.out.println("Column name: " + new String(nameByteArray, UTF8));

byte[] valByteArray = new byte[col.value.capacity()];

System.out.println("Column value: " + new String(valByteArray, UTF8));

//System.out.println("Column timestamp: " + col.clock);

//create a slice predicate representing the columns to read	 
//start and finish are the range of columns--here, all	 
SlicePredicate predicate = new SlicePredicate();	 
SliceRange sliceRange = new SliceRange(); sliceRange.setStart(new byte[0]);	 
sliceRange.setFinish(new byte[0]);	 
predicate.setSlice_range(sliceRange);

System.out.println("Complete Row:");	 // read all columns in the row
ColumnParent parent = new ColumnParent(cfName);	 
List<ColumnOrSuperColumn> results = client.get_slice(ByteBuffer.wrap(userIDKey), parent, predicate, CL);

//loop over columns, outputting values	 
for (ColumnOrSuperColumn result : results)
{
  Column column = result.column;
    nameByteArray = new byte[column.name.capacity()];
    valByteArray = new byte[column.value.capacity()];

    Charset charset = Charset.forName("UTF8");
    CharsetDecoder decoder = charset.newDecoder();
    try
    {
        CharBuffer cbuf = decoder.decode(column.value);
        String s = cbuf.toString();
        System.out.println(s);
    }
    catch (Exception ex)
    {

        System.out.println(ex.getMessage());
    }

    //System.out.println(new String(nameByteArray, UTF8) + " : " + new String(valByteArray, UTF8));

}
tf.close();

System.out.println("All done.");	}
}