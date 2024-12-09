package corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collections_Methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c1 = new ArrayList();
		c1.add("cat");
		c1.add("dog");
		c1.add("horse");
		c1.add("rat");
		c1.add("elephant");
		System.out.println(c1);
        c1.remove("rat");
        System.out.println(c1);
        Iterator i1 = c1.iterator();
        while(i1.hasNext())
        {
        	System.out.println(i1.next());
        }
        
     }

}
