/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexampleold;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import mvcexampleold.Student;

/**
 *
 * @author sdababneh
 */
public class StudentController {
   private Student model;
   private StudentView view;
   private  List studentList = new ArrayList();
   
   public StudentController()
   {
       
   }

   public StudentController(Student model, StudentView view){
      this.model = model;
      this.view = view;
   }

   public void setStudentName(String name){
      model.setName(name);		
   }

   public String getStudentName(){
      return model.getName();		
   }

   public void setStudentRollNo(String rollNo){
      model.setRollNo(rollNo);		
   }

   public String getStudentRollNo(){
      return model.getRollNo();		
   }

   public void updateView(){				
      view.printStudentDetails(model.getName(), model.getRollNo());
   }	
   
   public void loadStudents()
   {
      
      ExecutorService executor = Executors.newFixedThreadPool(1);
      for(int i = 1; i<= 5 ; i++)
      {
          Runnable runnable = new StudentThread(i);
          executor.execute(runnable);
      }
      studentList = StudentThread.studentList;
      executor.shutdown();
     
       
   }
   
   public String getStudent(String name)
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
   
   
   
}
