//Write a program on Get() method in the Map Interface."
package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment125 {

	public static void main(String[] args) {
		// Creating an empty Map
        Map<String, Integer> map = new HashMap<String, Integer>();
 
        // Mapping int values to string keys
        map.put("sushma", 10);
        map.put("4", 15);
        map.put("sush", 20);
        map.put("Welcomes", 25);
        map.put("You",30);
 
        // Displaying the Map
        System.out.println("Initial Mappings are: " + map);
 
        System.out.println("The Value is: " + map.get("sush"));
 
        // Getting the value of "You"
        System.out.println("The Value is: " + map.get("You"));
	}

}
