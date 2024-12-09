package corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Interface_Program3 {

	public static void main(String[] args) {
		Map<String,String> m1= new HashMap();
		m1.put("sushma","In55");
		m1.put("Vivaan","In102");
		m1.put("Rudresh","In505");
		m1.put("Rudresh s p","In501");
		m1.put("spandana","In115");
		m1.put("VivaanRpatel","In525");
		System.out.println(m1);
		for(String s1 :m1.keySet())
		{
			System.out.println("Fetching all keys:->"+s1);
		}
	for(String s2:m1.values())
	{
		System.out.println("Fetching values:->"+s2);
	}
	for(Entry<String, String> s3:m1.entrySet())
	{
		System.out.println("Fetching values all together:->"+s3);
	}	
	Set<Entry <String,String>> s4 = m1.entrySet();
	Iterator <Entry <String, String>> i1= s4.iterator();
	while(i1.hasNext())
	{
		System.out.println("Fetching key and value pair using iterator"+i1.next());
	}
	}

}
