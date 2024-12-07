//write a program on List Interface for ListIterator()
//of forward Iteration and Backward Iteration and Iterator() also."
package Assignments;

import java.util.ArrayList;
import java.util.ListIterator;

public class Assignment111 {

	public static void main(String[] args) {
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Amanda");
		aList.add("Peter");
		aList.add("Julie");
		aList.add("James");
		aList.add("Emma");
		ListIterator li = aList.listIterator();
		System.out.println("The ArrayList elements are: ");
		while (li.hasNext()) {
		   System.out.println(li.next());
		 }
	      System.out.println("The ArrayList elements in the reverse direction are: ");
	      while (li.hasPrevious()) {
	         System.out.println(li.previous());
	      }
	}

}
