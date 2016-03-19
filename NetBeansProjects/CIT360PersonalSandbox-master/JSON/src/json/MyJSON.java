/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json;

/**
 *
 * @author sdababneh
 */
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

class MyJSON {

   public static void main(String[] args) throws ParseException{
      JSONObject obj = new JSONObject();

      obj.put("name", "foo");
      obj.put("num", new Integer(100));
      obj.put("balance", new Double(1000.21));
      obj.put("is_vip", new Boolean(true));
      
      JSONObject obj2 = new JSONObject();
      System.out.print("JSON Parse");
      System.out.print(obj);
      
      JSONParser parser=new JSONParser();

  System.out.println("=======decode=======");
                
  String s="[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
  Object obj3=parser.parse(s);
  JSONArray array=(JSONArray)obj3;
  System.out.println("======the 2nd element of array======");
  System.out.println(array.get(1));
  System.out.println();
                
  JSONObject obj4=(JSONObject)array.get(1);
  System.out.println("======field \"1\"==========");
  System.out.println(obj2.get("1"));    
  
  s="{}";
  obj3=parser.parse(s);
  System.out.println(obj);
                
  s="[5,]";
  obj3=parser.parse(s);
  System.out.println(obj);
                
  s="[5,,2]";
  obj3=parser.parse(s);
  System.out.println(obj);
   }  
}
