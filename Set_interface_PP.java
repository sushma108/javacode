package corejava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_interface_PP {

	public static void main(String[] args) {
                 Set s1 = new HashSet();
                 s1.add("sun");
                 s1.add("moon");
                 s1.add("air");
                 s1.add("water");
                 s1.add(true);
                 s1.add("mountain");
                 s1.add("rock");
                 System.out.println(s1);
s1.add(null);
s1.add(null);//it doesnot follow duplicate
s1.add("air");
System.out.println(s1);
Iterator i1=s1.iterator();
while(i1.hasNext())
{
System.out.println(i1.next());	
}

	}

}
