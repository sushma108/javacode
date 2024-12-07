//Write a program using the put() method with Object, Object parameters in the Map Interface."
package Assignments;

import java.util.HashMap;

public class Assignment117 {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
		 
        // Mapping string values to int keys
        hash_map.put(10, "MKT");
        hash_map.put(15, "4");
        hash_map.put(20, "MKT");
        hash_map.put(25, "Welcomes");
        hash_map.put(30, "You");
 
        // Displaying the HashMap
        System.out.println("Initial Mappings are: " + hash_map);
 
        // Inserting existing key along with new value
        String returned_value = (String)hash_map.put(20, "All");
 
        // Verifying the returned value
        System.out.println("Returned value is: " + returned_value);
 
        // Displaying the new map
        System.out.println("New map is: " + hash_map);
   
	}

}
