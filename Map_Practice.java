package corejava;

import java.util.HashMap;
import java.util.Map;

public class Map_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String> m1= new HashMap();
m1.put("sushma","In55");
m1.put("Vivaan","In102");
m1.put("Rudresh","In505");
m1.put("Rudresh s p","In501");
m1.put("spandana","In115");
m1.put("VivaanRpatel","In525");
m1.put("Rama","In525");
System.out.println(m1);
Map<String,Integer> m2= new HashMap();
m2.put("Rice",10);
m2.put("Jaggery",20);
m2.put("Wheat",10);
m2.put("Sugar",1);
m2.put("Salt",5);
System.out.println(m2);
m2.remove("Rice");
m2.remove("Salt",5);
System.out.println(m2);
m1.get("Rama");
System.out.println(m1.get("Rama"));
System.out.println(m1.containsKey("Rama"));

	}

}
