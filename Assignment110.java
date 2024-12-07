//write a program on List Methods from add() to size() in the List Class"
package Assignments;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment110 {

	public static void main(String[] args) {
		List<String> vowels = new ArrayList<>();
        List<Integer> list= new LinkedList<>();  

		vowels.add("A"); // [A]
		vowels.add("E"); // [A, E]
		vowels.add("U"); // [A, E, U]

		System.out.println(vowels); // [A, E, U]

		vowels.add(2, "I"); // [A, E, I, U]
		vowels.add(3, "O"); // [A, E, I, O, U]

		System.out.println(vowels); // [A, E, I, O, U]
		int size= list.size();  
		System.out.println("Total element of the list : "+size);  
	}

}
