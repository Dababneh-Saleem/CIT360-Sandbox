//import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionstesting;

import java.util.*;

/**
 *
 * @author christianray
 */
public class CollectionsTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] fruits = {"Banana", "Apple", "Strawberry", "Peach"};
       List<String> fruitList = new ArrayList<String>();
       
       for(String x : fruits)
           fruitList.add(x);
           fruitList.add("Nectarine");
       
       String[] veggies = {"Carrot", "Broccoli", "Celery", "Spinach"};
       List<String> veggieList = new ArrayList<String>();
       
       for(String y : veggies)
           veggieList.add(y);
           fruitList.remove(fruitList.get(2));
       
       for(int i=0;i<fruitList.size();i++)
            System.out.println(fruitList.get(i));
       
        System.out.println("");
       
       for(int i=0;i<veggieList.size();i++)
            System.out.println(veggieList.get(i));
    }
    
}
