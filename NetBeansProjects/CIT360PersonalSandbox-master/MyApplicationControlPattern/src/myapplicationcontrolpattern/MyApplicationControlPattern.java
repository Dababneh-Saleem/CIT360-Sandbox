/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//MVC construction this would be viewed as the Controller
package myapplicationcontrolpattern;

import java.util.HashMap;

/**
 *
 * @author sdababneh
 */
public class MyApplicationControlPattern {
    public static HashMap<String, MathHandler> hMapCommand = new HashMap<String, MathHandler>();
    
    public void MyApplicationControlPattern(){
        
    }
    public static void cmdHandler(String command, Integer num1, Integer num2){
        hMapCommand.put("+", new Addition());
        hMapCommand.put("-", new Subtraction());
        hMapCommand.put("*", new Multiplication());
        hMapCommand.put("/", new Division());
        
        MathHandler handler = hMapCommand.get(command);
        handler.execute(num1,num2);
        // TODO code application logic here
    }
    
}
