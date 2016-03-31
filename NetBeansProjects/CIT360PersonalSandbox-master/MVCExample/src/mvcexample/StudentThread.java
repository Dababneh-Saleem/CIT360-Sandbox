/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SDababneh
 */
public class StudentThread implements Runnable {
    
    public static List studentList = new ArrayList(); 
    private int value = 0;
    
    public StudentThread(int value )
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
                student1.setName("Saleem");
                student1.setRollNo("10");
                studentList.add(student1);
            case 2:
                Student student2 = new Student();
                student2.setName("Brianne");
                student2.setRollNo("11");
                studentList.add(student2);
            case 3:
                Student student3 = new Student();
                student3.setName("Palmer");
                student3.setRollNo("12");
                studentList.add(student3);
            case 4:
                Student student4 = new Student();
                student4.setName("Adilyn");
                student4.setRollNo("13");
                studentList.add(student4);
            case 5:
                Student student5 = new Student();
                student5.setName("Rigley");
                student5.setRollNo("14");
                studentList.add(student5);

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
