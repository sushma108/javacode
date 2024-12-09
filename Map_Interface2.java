package corejava;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> m1= new HashMap();
		m1.put("sushma","In55");
		m1.put("Vivaan","In102");
		m1.put("Rudresh","In505");
		m1.put("Rudresh s p","In501");
		m1.put("spandana","In115");
		m1.put("VivaanRpatel","In525");
		System.out.println(m1);
		Map<String,String> m2= new HashMap();
		m2.put("Sita","In51");
		m2.put("Bala","In122");
		m2.put("Bhim","In535");
		m2.put("Mandar s p","In541");
	//	m2.put("Sia","In115");
		m2.put("Sihi","In565");
		System.out.println(m2);
		/*boolean b1=m1.equals(m2);
		System.out.println(b1);*/
		m2.putAll(m1);
		System.out.println(m2);
		m2.putIfAbsent("Sia", "In115");
		System.out.println("Udated Valiue"+m2);
	}

}
