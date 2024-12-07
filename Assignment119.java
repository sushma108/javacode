//Write a program to print name and Salary using the put() method in the Map Interface."
package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment119 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		 
        // Add key-value pairs to the map
        map.put("vivaan",300000);
        
 
        // Display the map after adding elements
        System.out.println("the person name and salary is: " + map);
        
	}

}
