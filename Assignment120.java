//Write a program using the putAll() method with Object, Object parameters in the Map Interface."
package Assignments;

import java.util.HashMap;

public class Assignment120 {

	public static void main(String[] args) {
		// Creating an empty HashMap 
	    HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 
	  
	    // Mapping string values to int keys  
	    hash_map.put(10, "GROTECH"); 
	    hash_map.put(15, "4"); 
	    hash_map.put(20, "MINDS"); 
	    hash_map.put(25, "Welcomes"); 
	    hash_map.put(30, "You"); 
	  
	    // Displaying the HashMap 
	    System.out.println("Initial Mappings are: " + hash_map); 
	  
	    // Creating a new hash map and copying 
	    HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>(); 
	    new_hash_map.putAll(hash_map); 
	  
	    // Displaying the final HashMap 
	    System.out.println("The new map looks like this: " + new_hash_map); 
	}

}
