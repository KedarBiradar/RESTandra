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

import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;

import java.net.InetSocketAddress;
import java.net.URI;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import org.apache.commons.lang.StringUtils;


public class RESTHttpServer
{
    public void StartHTTPServer()
    {
        InetSocketAddress addr = new InetSocketAddress(18220);
        try
        {
            HttpServer server = HttpServer.create(addr, 0);
            server.createContext("/", new RHandler());
            server.setExecutor(Executors.newCachedThreadPool());
            server.start();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}


class RHandler implements HttpHandler {
  public void handle(HttpExchange exchange) throws IOException
  {

    String requestMethod = exchange.getRequestMethod();

    if (requestMethod.equalsIgnoreCase("GET"))
    {
      Headers responseHeaders = exchange.getResponseHeaders();
      InetSocketAddress cIP = exchange.getRemoteAddress();
      OutputStream responseBody = exchange.getResponseBody();
      Headers requestHeaders = exchange.getRequestHeaders();
      Set<String> keySet = requestHeaders.keySet();
      URI path = exchange.getRequestURI();


      System.out.println("GET " + path.toString() + " " + cIP.toString());

      String urlParts[] = path.toString().split("/");
      String response = "";
     // System.out.println(urlParts.length);

      if (urlParts.length == 8)
      {

        String[] clrt = StringUtils.split(urlParts[7], ".");
        if(clrt[1].equalsIgnoreCase("json") || clrt[1].equalsIgnoreCase("xml") || clrt[1].equalsIgnoreCase("plain"))
        {
            HTTPCassandra CassInterface = new HTTPCassandra();

            String res[] = CassInterface.handleGET(urlParts);

            if(res[0].equals("200"))
            {
              response = res[1];
              responseHeaders.set("Content-Type", res[2]);
              exchange.sendResponseHeaders(200, response.length());
            }
            else
            {
              responseHeaders.set("Content-Type", "text/html");
              response = "<h1>" + res[1] + "</h1>";
              exchange.sendResponseHeaders(Integer.parseInt(res[0]), response.length());
            }
        }
        else
        {
            responseHeaders.set("Content-Type", "text/html");
            response = "<h1>Unsupported Media Type</h1>";
            exchange.sendResponseHeaders(415, response.length());
        }



      }
      else if(urlParts.length == 0)
      {
		  if(path.toString().equals("/"))
		  {
			  String str, page ="";
			  try
			  {
                  Process p = Runtime.getRuntime().exec("pwd");
                  String s = null;
                  BufferedReader stdInput = new BufferedReader(new
                       InputStreamReader(p.getInputStream()));

                  BufferedReader stdError = new BufferedReader(new
                       InputStreamReader(p.getErrorStream()));

                  // read the output from the command
                  while ((s = stdInput.readLine()) != null)
                  {
                      System.out.println(s);
                  }


				    BufferedReader in = new BufferedReader(new FileReader("../html/test.htm"));
				    while ((str = in.readLine()) != null)
				    {
				        page = page +str;
				    }
				    in.close();
			  }
			  catch (IOException e)
			  {
				  System.out.println("Failed to read in file");
			  }
			  response = page;
			  responseHeaders.set("Content-Type", "text/html");
			  exchange.sendResponseHeaders(200, response.length());
		  }
		  else
		  {
			  responseHeaders.set("Content-Type", "text/html");
			  response = "<H1>RESTandra - 400 Bad Request</H1>";
			  exchange.sendResponseHeaders(400, response.length());
		  }
      }
      else
      {
		  responseHeaders.set("Content-Type", "text/html");
		  String error[] = lengthError(urlParts.length);
		  response = error[1];
		  exchange.sendResponseHeaders(Integer.parseInt(error[0]), response.length());
	  }
      responseBody.write(response.getBytes());
      responseBody.close();
    }

    else if(requestMethod.equalsIgnoreCase("POST"))
    {
    	Headers responseHeaders = exchange.getResponseHeaders();
        InetSocketAddress cIP = exchange.getRemoteAddress();
        OutputStream responseBody = exchange.getResponseBody();
        Headers requestHeaders = exchange.getRequestHeaders();
        URI path = exchange.getRequestURI();
        BufferedReader in=null;
        in = new BufferedReader(new InputStreamReader(exchange.getRequestBody()));
        String reqBody ="";
        String response = "";

        //Log Request
        System.out.println("POST Request from: " + cIP.toString() + " Path: " + path.toString());
        //Read POST variables/Request body

        String urlParts[] = path.toString().split("/");

        reqBody = in.readLine();

        if(reqBody != null)
        {
        	if (urlParts.length == 8)
            {

	    		HTTPCassandra CassInterface = new HTTPCassandra();
                //todo: url decode
	        	String[] vars = reqBody.toString().split("&");
	  	      	String res[] = CassInterface.handlePOST(urlParts, vars);

      	      if(res[0].equals("201"))
      	      {
      	    	  response = res[1];
      	    	  responseHeaders.set("Content-Type", "text/html");
      		      exchange.sendResponseHeaders(201, response.length());
      	      }
      	      else
      	      {
      	    	  responseHeaders.set("Content-Type", "text/html");
      		      response = "<h1>" + res[1] + "</h1>";
      		      exchange.sendResponseHeaders(Integer.parseInt(res[0]), response.length());
      	      }
            }
            else
            {

				responseHeaders.set("Content-Type", "text/html");
				String error[] = lengthError(urlParts.length);
				response = error[1];
				System.out.println(response + " " + response.length());
				exchange.sendResponseHeaders(Integer.parseInt(error[0]), response.length());
      	  	}

        }
        else
        {
        	System.out.println("Empty POST request");

        	responseHeaders.set("Content-Type", "text/html");
            response = "<H1>Empty POST Request</H1> ";

            exchange.sendResponseHeaders(400, 0);

        }

        responseBody.write(response.getBytes());
        responseBody.close();


    }
    else if(requestMethod.equalsIgnoreCase("PUT"))
    {
    	Headers responseHeaders = exchange.getResponseHeaders();
        InetSocketAddress cIP = exchange.getRemoteAddress();
        OutputStream responseBody = exchange.getResponseBody();
        Headers requestHeaders = exchange.getRequestHeaders();
        URI path = exchange.getRequestURI();
        BufferedReader in=null;
        in = new BufferedReader(new InputStreamReader(exchange.getRequestBody()));
        String reqBody ="";
        String response = "";

        //Log Request
        System.out.println("POST Request from: " + cIP.toString() + " Path: " + path.toString());
        //Read POST variables/Request body

        String urlParts[] = path.toString().split("/");

        reqBody = in.readLine();

        if(reqBody != null)
        {
        	if (urlParts.length == 8)
            {

	    		HTTPCassandra CassInterface = new HTTPCassandra();
                //todo: url decode
	        	String[] vars = reqBody.toString().split("&");
	  	      	String res[] = CassInterface.handlePOST(urlParts, vars);

      	      if(res[0].equals("201"))
      	      {
      	    	  response = res[1];
      	    	  responseHeaders.set("Content-Type", "text/html");
      		      exchange.sendResponseHeaders(201, response.length());
      	      }
      	      else
      	      {
      	    	  responseHeaders.set("Content-Type", "text/html");
      		      response = "<h1>" + res[1] + "</h1>";
      		      exchange.sendResponseHeaders(Integer.parseInt(res[0]), response.length());
      	      }
            }
            else
            {

				responseHeaders.set("Content-Type", "text/html");
				String error[] = lengthError(urlParts.length);
				response = error[1];
				System.out.println(response + " " + response.length());
				exchange.sendResponseHeaders(Integer.parseInt(error[0]), response.length());
      	  	}

        }
        else
        {
        	System.out.println("Empty PUT request");

        	responseHeaders.set("Content-Type", "text/html");
            response = "<H1>Empty PUT Request</H1> ";

            exchange.sendResponseHeaders(400, 0);

        }

        responseBody.write(response.getBytes());
        responseBody.close();
    }
    else if(requestMethod.equalsIgnoreCase("DELETE"))
    {
        Headers responseHeaders = exchange.getResponseHeaders();
        InetSocketAddress cIP = exchange.getRemoteAddress();
        OutputStream responseBody = exchange.getResponseBody();
        Headers requestHeaders = exchange.getRequestHeaders();
        URI path = exchange.getRequestURI();
        BufferedReader in=null;
        in = new BufferedReader(new InputStreamReader(exchange.getRequestBody()));
        String reqBody ="";
        String response = "";
    	String urlParts[] = path.toString().split("/");


        //Log Request
        System.out.println("DELETE Request from: " + cIP.toString() + " Path: " + path.toString());

        HTTPCassandra CassInterface = new HTTPCassandra();
        String res[] = CassInterface.handleDELETE(urlParts);

        System.out.println(res[1]);

        responseHeaders.set("Content-Type", "text/html");
        String testResponse = "<H1>DELETE</H1>";

        exchange.sendResponseHeaders(200, 0);
        responseBody.write(testResponse.getBytes());

        responseBody.close();
    }

  }



  private String[] lengthError(int len)
  {
	  String[] error = new String[2];
	  //1System.out.println("len: " + len);
	  if(len < 8)
      {
    	  if(len == 0)
    	  {
    		  //Test Page
    		  System.out.println("PROBLEM");
    		  error[0] = "400";
    		  error[1] = "<H1>RESTandra - 400 Bad Request</H1>";
    	  }
    	  else
    	  {
    		  //Not all parameters sent
    		  //responseHeaders.set("Content-Type", "text/html");
    		  error[0] = "400";
    		  error[1] = "<H1>RESTandra - 400 Bad Request</H1>";
    	  }
      }
      else if(len > 8)
      {
    	  //Malformed URL, too many parameters sent.
    	  error[0] = "413";
    	  error[1] = "<H1>RESTandra - 413 Request Entity Too Large</H1>";
      }
      else
      {
    	 // responseHeaders.set("Content-Type", "text/html");
    	  error[0] = "500";
    	  error[1] = "<H1>RESTandra - 500 Internal Server Error</H1>";
	      //exchange.sendResponseHeaders(500, response.length());
      }

	  return error;
  }

}