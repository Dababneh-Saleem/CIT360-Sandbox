import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

 

public class MapTest {

     

    public static void main(String[] args) {

        Map fruits = new HashMap();

         

        // Add some vehicles.

        fruits.put("Apple", 6);

        fruits.put("Banana", 9);

        fruits.put("Watermelon", 2);

        fruits.put("Grape", 15);

         

        System.out.println("Total fruits: " + fruits.size());

         

        for (Iterator it = fruits.keySet().iterator(); it.hasNext();) {
            Object key = it.next();
            System.out.println(key + " - " + fruits.get(key));
        }

        System.out.println();

         

        String searchKey = "Grape";

        if(fruits.containsKey(searchKey))

            System.out.println("Found total " + fruits.get(searchKey) + " "

                    + searchKey + " fruits!\n");

         

        // Clear all values.

        fruits.clear();

         

        // Equals to zero.

        System.out.println("After clear operation, size: " + fruits.size());

    }

}
