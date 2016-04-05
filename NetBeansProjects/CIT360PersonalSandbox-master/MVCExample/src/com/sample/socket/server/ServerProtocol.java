/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.socket.server;

import com.sample.httpurlconnection.HTTPCommunication;
import com.sample.maincontroller.MainController;

/**
 *
 * @author SDababneh
 */
public class ServerProtocol {
    
    private static final int WAITINGSTAGE = 0;
    private static final int CONNECTEDSTATE= 1;
    private static final int PREEXITSTAGE = 2;
    private static final int EXITSTAGE = 3;
    private static int state = WAITINGSTAGE;
    
 
    private static String selectedGrade = null;
    
    
    public String processInput(String input)
    {
        try{
            
        
        String outputLine = null;
        if(state==WAITINGSTAGE){
            
          
           
            outputLine="Connected. Please select from the options below:-1.Please enter the letter grade for the desire sutdent list (A, B, or C): {ENTER BELOW]-2.Please enter a website address to access: [ENTER BELOW]-";
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
                            
                             outputLine= HTTPCommunication.doConnect("http://"+input)+"   - Press R to repeat or Q to quit.";
                              Thread.sleep(100);
                              state = EXITSTAGE;
                        }else{
                             outputLine= HTTPCommunication.doConnect(input)+"   - Press R to repeat or Q to quit.";
                              state = EXITSTAGE;
                        }
                       
                     }else{
                         
                          //loadStudents and getStudents
                          selectedGrade= input;
                          String studentNames = MainController.cmdHandler(input);
                          
                          if(studentNames == null)
                          {
                                outputLine = "Student list is loading please wait...";
                                 state = CONNECTEDSTATE;
                          }else{
                                 outputLine = "Grade "+input+" student name list: " +studentNames+". Please enter a student name from the above list for their Roll Number. ";
                               state = PREEXITSTAGE;
                          }
                       
                     }
                    
                     
                }
              
              
            }
            
        }else if(state == PREEXITSTAGE){
            
           String rollNumber =  MainController.cmdHandlerForStudent(selectedGrade,input);
             outputLine = "Roll number for "+input+" is :"+rollNumber +"   - Press R to repeat or Q to quit.";
             state = EXITSTAGE;
        }       
        else if(state == EXITSTAGE)
        {
            if(input.equalsIgnoreCase("Q"))
            {
                 outputLine = "Bye, see you later ";
            }else {
                   outputLine="Connected. Please select from the options below:"
                    + "1.Please enter the letter grade for the desire sutdent list (A,B, or C): {ENTER BELOW]"
                    + "2.Please enter a website address to access";
            state = CONNECTEDSTATE;
            }
            
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
