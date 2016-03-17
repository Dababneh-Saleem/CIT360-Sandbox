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

/***********IMPORTS*****************/
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

/*********Program***************/
public class myJavacollectionsframework {
/*********MAIN CLASS***************/  
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<>();
        LinkedHashMap<Integer, String> lhmap;
        lhmap = new LinkedHashMap<>();
        TreeMap<Integer, String> tmap; 
        tmap = new TreeMap<>();
        
        OutputMap (tmap);
        OutputMap (lhmap);
        OutputMap (hmap);
    }
    /*Method to call when one wishes to create a map, populate it with values and output it*/
    public static void OutputMap( Map<Integer, String> map) {
        /*Put values into map*/
        map.put(1, "One");
        map.put(10, "Ten");
        map.put(6, "Six");
        map.put(11, "Eleven");
        map.put(7, "Seven");
        map.put(6, "Six");
        map.put(11, "Twelve");
        /*output map*/
        System.out.println("Map Output");
        for(Integer key: map.keySet()) {
            String otext = map.get(key);
            
            System.out.println(otext);
        }
        
    }
}
