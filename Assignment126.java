//Write a program on Contains() method both Key and Values in the Map Interface."
package Assignments;

import java.util.HashMap;

public class Assignment126 {

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

        // Checking for the key_element '20'
        System.out.println("Is the key '20' present? " + 
        hash_map.containsKey(20));

        // Checking for the key_element '5'
        System.out.println("Is the key '5' present? " + 
        hash_map.containsKey(5));

	}

}
