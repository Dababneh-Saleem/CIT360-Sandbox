/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sample.gradec;

import java.util.ArrayList;
import java.util.List;
import mvcexample.Student;

/**
 *
 * @author SDababneh
 */
public class GradeCStudentThread implements Runnable {
    
      public static List studentList = new ArrayList(); 
    private int value = 0;
    
    public GradeCStudentThread(int value )
    {
        this.value = value ;
    }

    @Override
    public void run() {
         System.out.println(Thread.currentThread().getName()+"Running thread number is "+value);
         processStudents();
       
        switch (value) {
            case 1:
                Student student1 = new Student();
                student1.setName("Brian");
                student1.setRollNo("754");
                student1.setPercentage("75%");
                studentList.add(student1);
            case 2:
                Student student2 = new Student();
                student2.setName("Ezra");
                student2.setRollNo("545");
                student2.setPercentage("74%");
                studentList.add(student2);
            case 3:
                Student student3 = new Student();
                student3.setName("Palmer");
                student3.setRollNo("777");
                student3.setPercentage("79%");
                studentList.add(student3);
            case 4:
                Student student4 = new Student();
                student4.setName("Wilson");
                student4.setRollNo("132");
                student4.setPercentage("75%");
                studentList.add(student4);
        }


       
    }
    
    
    private void processStudents(){
        try{
        Thread.sleep(20000);
        }catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
    
}
