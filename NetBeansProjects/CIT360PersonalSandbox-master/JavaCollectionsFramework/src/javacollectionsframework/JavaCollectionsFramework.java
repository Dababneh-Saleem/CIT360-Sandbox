/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacollectionsframework;

/**
 *
 * @author sdababneh
 */
import java.util.HashMap;   
public class JavaCollectionsFramework {
  
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        
        hmap.put(1, "One");
        hmap.put(10, "Ten");
        hmap.put(6, "Six");
        hmap.put(11, "Eleven");
        
        String otext = hmap.get(6);
        
        System.out.println(otext);
        
    }
}