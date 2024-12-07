//Write a program on Remove() method with Key and Both Key ,Value parameters in the Map Interface."
package Assignments;

import java.util.HashMap;

public class Assignment124 {

	public static void main(String[] args) {
		// Creating an empty HashMap
	    HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
	 
	    // Mapping string values to int keys 
	    hash_map.put(10, "MKT");
	    hash_map.put(15, "4");
	    hash_map.put(20, "MKT");
	    hash_map.put(25, "Welcomes");
	    hash_map.put(30, "You");
	 
	    // Displaying the HashMap
	    System.out.println("Initial Mappings are: " + hash_map); 
	 
	    // Removing the existing key mapping
	    String returned_value = (String)hash_map.remove(20);
	 
	    // Verifying the returned value
	    System.out.println("Returned value is: "+ returned_value);
	 
	    // Displaying the new map
	    System.out.println("New map is: "+ hash_map);

	}

}
