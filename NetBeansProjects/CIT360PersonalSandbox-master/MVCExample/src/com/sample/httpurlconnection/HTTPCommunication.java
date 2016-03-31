package com.sample.httpurlconnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class HTTPCommunication {
    
   
  
  
  
  public static String doConnect(String websiteurl)
  {
      try {    
      
      URL url = new URL(websiteurl);
      HttpURLConnection con = (HttpURLConnection) url.openConnection();
      String readStream = readStream(con.getInputStream());
      // Give output for the command line
      System.out.println(readStream);
     
     
       return readStream;
    } catch (Exception e) {
      e.printStackTrace();
     
    }
      return null;
  }

  private static String readStream(InputStream in) {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {
      
      String nextLine = "";
      while ((nextLine = reader.readLine()) != null) {
        sb.append(nextLine);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sb.toString();
  }
} 