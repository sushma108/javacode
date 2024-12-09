package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ClassProperties {

	public static void main(String[] args) {

		  List l1=    new ArrayList();
		  l1.add(765);
		  l1.add(-78);
		  l1.add(85);
		  l1.add(0);
		  l1.add("Moon");
		  l1.add("sun");
		  l1.add(true);
          l1.add(null);
		  l1.add(null);

		  System.out.println(l1);
		  //it follow indexing
		  //it will allow order of insertion
		  //accept duplicate as well
		  //it is dynamic in nature
		  Iterator i1 =l1.iterator();
		  System.out.println("using iterator only forward iteration");
		  while(i1.hasNext())
		  {
			  System.out.println(i1.hasNext());
		  }
		  ListIterator i2 = l1.listIterator();
		  System.out.println("using list of iterator forward direction");
		  while(i2.hasNext())
		  {
			 System.out.println(i2.next()); 
		  }
		  while(i2.hasPrevious())
			  System.out.println("using list of iterator backward direction");
		  {
			System.out.println(i2.hasPrevious());  
		  }	
	}

}
//Note:-backward iteration is not possible without forward iteration