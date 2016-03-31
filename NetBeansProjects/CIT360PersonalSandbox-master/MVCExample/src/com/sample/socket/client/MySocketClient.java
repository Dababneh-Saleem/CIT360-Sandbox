/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.socket.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author SDababneh
 */
public class MySocketClient {

    /**
     * @param args the command line arguments
     */
   
         public static String HOSTNAME = "localhost";
    public static int PORTNUMBER = 9990;
    
    public static void main(String args[])
    {      
        try{
         Socket socket = new Socket(HOSTNAME,PORTNUMBER);
         PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
          BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          BufferedReader readerIn = new BufferedReader(new InputStreamReader(System.in));
          String fromServer,fromClient;
         while((fromServer = reader.readLine()) != null )
         {
         System.out.println("From server : "+fromServer);
         while(fromServer.contains("loading")){
             fromServer = reader.readLine();
               System.out.println("From server : "+fromServer);
               if(fromServer.contains("loading"))
               {
                   continue;
               }else{
                   break;
               }
             
         }
         if(fromServer.contains("Bye"))
         {
             break;
         }
        fromClient = readerIn.readLine();
         System.out.println("From client : "+fromClient);
         writer.println(fromClient); 
        
         }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
      
    }
    
    
}
