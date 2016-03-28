/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.socket.server;

/**
 *
 * @author SDababneh
 */
public class ServerProtocol {
    
    private static final int WAITINGSTAGE = 0;
    private static final int CONNECTEDSTATE= 1;
    private static final int EXITSTAGE = 2;
    private static int state = WAITINGSTAGE;
    
    
    public String processInput(String input)
    {
        String outputLine = null;
        if(state==WAITINGSTAGE){
            outputLine="Connected. Please tell me your name: {ENTER BELOW]";
            state = CONNECTEDSTATE;
                    
        }else if(state == CONNECTEDSTATE)
        {
            
            if(input != null && !input.equals(""))
            {
                try{
                    int number = Integer.parseInt(input);
                     outputLine = "Please enter only letters";
                      state = CONNECTEDSTATE;
                }catch(Exception e)
                {
                   
                     outputLine = "Hi " + input + ", Thanks you for connecting.";
                      state = EXITSTAGE;
                }
              
              
            }
            
        }else if(state == EXITSTAGE)
        {
             outputLine = "Bye see you later ";
        }else{
             outputLine = "Connected please type something !! ";
        }
      return outputLine;
    }
    
}
