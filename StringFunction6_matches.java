//check if the given string consist of exact 3 letters
package corejava;

public class StringFunction6_matches {

	public static void main(String[] args) {
  
		String a="axe";
	boolean b1 =	a.matches("...");
		System.out.println(b1);
		//check if the given string starts with a
		System.out.println(a.matches("a(.*)"));//(.*)->represents multicharacter
		//check if the given string is ends with e
		System.out.println(a.matches("(.*)e"));
		 String a1="Manishtiwari";
		 //check if the given string there is a letter u in it
		 System.out.println(a1.matches("(.*)u(.*)"));
        //repeat string function
		// System.out.println(a1.repeat(5));//upgrade java version after seeing recorded video
		 System.out.println(a1.lastIndexOf('i'));
	}

}
