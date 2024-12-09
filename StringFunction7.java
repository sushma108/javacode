package corejava;

public class StringFunction7 {

	public static void main(String[] args) {
 String a="automation";
 String b= a.concat("trsting");
 System.out.println(b);
 //string is immutable
 System.out.println(a);
 System.out.println(a.concat("testing"));
 String name="manish";
 System.out.println(name.concat("kumar").concat("tiwari"));
	String a1=new String("sushms");
	System.out.println(a1);
	StringBuffer s4=new StringBuffer("Vivaan");
	               s4.append("is good");
	               System.out.println(s4);//string buffer is mutable
	               
	}

}
