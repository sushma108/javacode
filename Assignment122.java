//Write a program using the Equals() method in the Map Interface."
package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment122 {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>(); 
        Map<Integer, String> map2 = new HashMap<Integer, String>(); 
  
        // Mapping string values to int keys 
        map1.put(10, "MKT"); 
        map1.put(15, "4"); 
        map1.put(20, "MKT"); 
        map1.put(25, "Welcomes"); 
        map1.put(30, "You"); 
  
        // Mapping string values to int keys 
        map2.put(10, "MKT"); 
        map2.put(15, "4"); 
        map2.put(20, "MKT"); 
        map2.put(25, "Welcomes"); 
        map2.put(30, "You"); 
  
        // Displaying the Map1 
        System.out.println("First Map: "
                           + map1); 
  
        // Displaying the Map2 
        System.out.println("Second Map: "
                           + map2); 
  
        // Checking the equality 
        System.out.println("Equality: " + map1.equals(map2)); 
   
	}

}
