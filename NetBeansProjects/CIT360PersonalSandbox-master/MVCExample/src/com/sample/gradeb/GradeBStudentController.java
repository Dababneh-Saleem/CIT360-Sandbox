/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.gradeb;

import com.sample.gradea.GradeAStudentThread;
import com.sample.handler.StudentHandler;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import com.sample.bean.Student;

/**
 *
 * @author SDababneh
 */
public class GradeBStudentController implements StudentHandler {
    
        private  List studentList = new ArrayList();
   
     @Override
     public void loadStudents()
   {
      
      ExecutorService executor = Executors.newFixedThreadPool(1);
      for(int i = 1; i<= 5 ; i++)
      {
          Runnable runnable = new GradeBStudentThread(i);
          executor.execute(runnable);
      }
      studentList = GradeBStudentThread.studentList;
      executor.shutdown();
     
       
   }
    @Override
   public String getOneStudent(String name)
   {
       
       int size = studentList.size();
       if(size >0)
       {
           for(int i=0; i<size ;i++)
           {
               Student s = (Student)studentList.get(i);
               if(s.getName().equalsIgnoreCase(name) )
               {
                   return s.getRollNo();
               }
           }
       }
       return null;
   }

    @Override
    public String getStudents() {
        
         int size = studentList.size();
         String nameList = " [ ";
       if(size >0)
       {
           for(int i=0; i<size ;i++)
           {
               Student s = (Student)studentList.get(i);
              
              if(i==size-1){
                   nameList = nameList +s.getName();
              } else{
                   nameList = nameList +s.getName()+", ";
              }
             
              
           }
             return nameList+" ]";
       }
       return null;
       
    }
    
    
}
