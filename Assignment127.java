//Write a program on clear() and isempty() method in the Map Interface."
package Assignments;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Assignment127 {

	public static void main(String[] args) {
		 Map<String, Integer> identity_hash = new 
                 IdentityHashMap<String, Integer>(); 

    // Mapping int values to string keys 
    identity_hash.put("sushma", 10); 
    identity_hash.put("4", 15); 
    identity_hash.put("vivaan", 20); 
    identity_hash.put("Welcomes", 25); 
    identity_hash.put("You", 30); 

    // Displaying the IdentityHashMap 
    System.out.println("The Mappings are: "+ 
                                  identity_hash); 

    // Checking for the emptiness of Map 
    System.out.println("Is the map empty? "+ 
                       identity_hash.isEmpty()); 
 // Creating an empty Map 
    Map<Integer, String> map = new HashMap<Integer, String>(); 

    // Mapping string values to int keys 
    map.put(10, "MKT"); 
    map.put(15, "4"); 
    map.put(20, "MKT"); 
    map.put(25, "Welcomes"); 
    map.put(30, "You"); 

    // Displaying the Map 
    System.out.println("Initial Mappings are: " + map); 

    // Clearing the map using clear() 
    map.clear(); 

    // Displaying the final HashMap 
    System.out.println("Finally the maps look like this: " + map); 

    
	}

}
