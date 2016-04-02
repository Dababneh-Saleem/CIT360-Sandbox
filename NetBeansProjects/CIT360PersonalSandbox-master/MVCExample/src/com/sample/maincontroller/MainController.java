/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.maincontroller;

import com.sample.gradea.GradeAStudentController;
import com.sample.gradeb.GradeBStudentController;
import com.sample.gradec.GradeCStudentController;
import com.sample.handler.StudentHandler;
import java.util.HashMap;
import mvcexample.Student;

/**
 *
 * @author SDababneh
 */
public class MainController {
    
      public static HashMap<String, StudentHandler> hMapCommand = new HashMap<String, StudentHandler>();
    
    public void MyApplicationControlPattern(){
        
    }
    public static String  cmdHandler(String command){
        hMapCommand.put("A", new GradeAStudentController());      
        hMapCommand.put("B", new GradeBStudentController());       
        hMapCommand.put("C", new GradeCStudentController());      
        
        
        StudentHandler handler = hMapCommand.get(command.toUpperCase());
        handler.loadStudents();
        return handler.getStudents();
        // TODO code application logic here
    }
    
    public static String cmdHandlerForStudent(String command,String studentName){
         StudentHandler handler = hMapCommand.get(command.toUpperCase());       
        return handler.getOneStudent(studentName);
    }
            
    
    
    
    
    
}
