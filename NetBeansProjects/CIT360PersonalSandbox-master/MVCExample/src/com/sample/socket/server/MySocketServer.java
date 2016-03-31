/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.socket.server;


import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 *
 * @author SDababneh
 */
public class MySocketServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        try{
         ServerSocket server = new ServerSocket(9990);
         Socket clientSocket = server.accept();
         System.out.println("Waiting for client on port " +
                         "9990" + "...");
         PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(),true);
         BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
         String inputLine ,outputLine;
         ServerProtocol sp = new ServerProtocol();
         outputLine = sp.processInput(null);
         writer.println(outputLine);
         while((inputLine = reader.readLine()) != null )
         {
        
           outputLine = sp.processInput(inputLine);
           writer.println(outputLine);
          while(outputLine.contains("loading"))
          {
               Thread.sleep(1000);
               outputLine = sp.processInput(inputLine);
                writer.println(outputLine);
                if(outputLine.contains("loading"))
                {
                    continue;
                }else{
                    break;
                }
          }
        
         if(outputLine.contains("Bye")){
             break;
         }
         }
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    
  
    
}


