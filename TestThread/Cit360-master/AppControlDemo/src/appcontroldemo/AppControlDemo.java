/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontroldemo;

import java.util.Scanner;

/**
 *
 * @author sdababneh
 */
public class AppControlDemo
{
  public static void main( String[] args )
  {
    /*AppController frontController = new AppController();
    frontController.dispatchRequest("FIRST");
    System.out.println();
    frontController.dispatchRequest("SECOND");
    System.out.println();
    frontController.dispatchRequest("THIRD"); */
    //String user_input;  
    Scanner input = new Scanner(System.in);
    System.out.println("Please type first, second, or third to go to a page.");
    AppController app = new AppController();
    app.dispatchRequest(input.next());
      
  }
}