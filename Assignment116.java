//Write a program using the put() method with String, String parameters in the Map Interface. "
package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment116 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(3, "Three");
        map.put(5, "Five");
        map.put(7, "Seven");
        map.put(9, "Nine");
        System.out.println(map);
	}

}
