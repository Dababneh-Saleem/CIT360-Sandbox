/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvcexample;

/**
 *
 * @author sdababneh
 */
public class MVCExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //fetch student record based on his roll no from the database
      /*Student model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudentView view = new StudentView();

      StudentController controller = new StudentController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();*/
        String fromServer = "Connected. Please select from the options below:-1.Please enter the letter grade for the desire sutdent list (A, B, or C): {ENTER BELOW]-2.Please enter a website address to access: [ENTER BELOW]-";
          String[] strArray = fromServer.split("-");
               if(strArray.length>0)
               {
                   System.out.println("From server : ");
                   for(int i =0 ; i<strArray.length;i++)
                   {
                       System.out.println(strArray[i]);
                   }
               }
              
    }
    private static Student retriveStudentFromDatabase(){
      Student student = new Student();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
}
