//Write a program on sort method in collection class for integer values ."
package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment114 {

	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<>(Arrays.asList(1,4,3,6,5,2));

	      System.out.println("Initial collection value: " + list);
	      // sort the list.
	      Collections.sort(list);
	      System.out.println("Final collection value: " + list);
	}

}
