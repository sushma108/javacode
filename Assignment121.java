//Write a program using the putIfAbsent() method in the Map Interface."
package Assignments;

import java.util.HashMap;

public class Assignment121 {

	public static void main(String[] args) {
		HashMap<String, String> capitalCities = new HashMap<String, String>();

	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    
	    // Add new entries only if they don't exist
	    capitalCities.putIfAbsent("Canada", "Ottawa");
	    capitalCities.putIfAbsent("England", "Cambridge");
	    
	    System.out.println(capitalCities);
	}

}
