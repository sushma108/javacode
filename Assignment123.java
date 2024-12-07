//Write a program on Iteration methods in the Map Interface using For Each Loop Concept.
//1.keySet().
//2.values().
//3.entrySet()."
package Assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment123 {

	public static void main(String[] args) {
		Map<String,String> gfg = new HashMap<String,String>();
	    
        // enter name/url pair
        gfg.put("GFG", "MKT.org");
        gfg.put("Practice", "practice.MKT.org");
        gfg.put("Code", "code.MKT.org");
        gfg.put("Quiz", "www.grotecjminds.org");
        
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : gfg.entrySet()) 
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
     // using keySet() for iteration over keys
        for (String name : gfg.keySet()) 
            System.out.println("key: " + name);
        
        // using values() for iteration over values
        for (String url : gfg.values()) 
            System.out.println("value: " + url);

	}

}
