/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import javaapplication6.TestJUnit;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author SDababneh
 * 
 * This is only needed to run the Unit Test inside of the IDE.  This does not neep to 
 * be packaged with any final code.  
 */
public class TestJunitRunner {
    
    public static void main(String args[])
    {
        Result result = JUnitCore.runClasses(TestJUnit.class);  
        
        for(Failure failure : result.getFailures())
        {
            System.out.println("Failure description is :"+failure.toString());
        }
        System.out.println("Over all result is  :"+result.wasSuccessful());
        
    }
    
}
