/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.socket.server;

import com.sample.httpurlconnection.HTTPCommunication;
import mvcexample.StudentController;

/**
 *
 * @author SDababneh
 */
public class ServerProtocol {
    
    private static final int WAITINGSTAGE = 0;
    private static final int CONNECTEDSTATE= 1;
    private static final int EXITSTAGE = 2;
    private static int state = WAITINGSTAGE;
    
    StudentController studentController = new StudentController();
    
    
    public String processInput(String input)
    {
        try{
            
        
        String outputLine = null;
        if(state==WAITINGSTAGE){
            
          studentController.loadStudents();
           
            outputLine="Connected. Please select from the options below:"
                    + "1.Please enter student name: {ENTER BELOW]"
                    + "2.Please enter a website address to access";
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
                     if(input.contains("www"))
                     {
                        if(!input.contains("http")){
                            
                             outputLine= HTTPCommunication.doConnect("http://"+input);
                              Thread.sleep(100);
                        }else{
                             outputLine= HTTPCommunication.doConnect(input);
                              state = EXITSTAGE;
                        }
                       
                     }else{
                         
                          String rollNumber = studentController.getStudent(input);
                          
                          if(rollNumber == null)
                          {
                                outputLine = "Student list is loading please wait...";
                                 state = CONNECTEDSTATE;
                          }else{
                                 outputLine = "The student Roll# is: "+studentController.getStudent(input);
                               state = EXITSTAGE;
                          }
                       
                     }
                    
                     
                }
              
              
            }
            
        }else if(state == EXITSTAGE)
        {
             outputLine = "Bye see you later ";
        }else{
             outputLine = "Connected please type something !! ";
        }
            return outputLine;
        }catch(Exception e)
        {
            e.printStackTrace();
        }
      return null;
    }
    
    
}
