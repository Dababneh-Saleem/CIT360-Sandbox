/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsontest;

import java.util.Map;
import org.json.simple.JSONObject;

/**
 *
 * @author christianray
 */
public class JSONTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  JSONObject employee = new JSONObject();
  
  employee.put("name","Bob");
  employee.put("number","0010010");
  employee.put("state","GA");
  employee.put("salary","$35,000");
  
  System.out.println(employee);




  
    
}
}