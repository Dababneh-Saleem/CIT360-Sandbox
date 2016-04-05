/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrationsample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SDababneh
 */
public class GradeBStudentThread implements Runnable {
    
      public static List studentList = new ArrayList(); 
    private int value = 0;
    
    public GradeBStudentThread(int value )
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
                student1.setName("Nolan");
                student1.setRollNo("414");
                student1.setPercentage("82%");
                studentList.add(student1);
            case 2:
                Student student2 = new Student();
                student2.setName("Melissa");
                student2.setRollNo("444");
                student2.setPercentage("84%");
                studentList.add(student2);
            case 3:
                Student student3 = new Student();
                student3.setName("Jamie");
                student3.setRollNo("122");
                student3.setPercentage("86%");
                studentList.add(student3);
            case 4:
                Student student4 = new Student();
                student4.setName("Dalton");
                student4.setRollNo("228");
                student4.setPercentage("89%");
                studentList.add(student4);
            case 5:
                Student student5 = new Student();
                student5.setName("Brody");
                student5.setRollNo("106");
                student5.setPercentage("86%");
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
