//Write a program on Insert() method using StringBuffer Class"
package Assignments;

public class Assignment130 {

	public static void main(String[] args) {
		 StringBuffer s = new StringBuffer("suhma"); 
	        System.out.println("string = " + s); 
	  
	        // insert boolean value at offset 8 
	        s.insert(2, 's'); 
	  
	        // prints stringbuffer after insertion 
	        System.out.print("After insertion = "); 
	        System.out.println(s.toString()); 
	}

}
