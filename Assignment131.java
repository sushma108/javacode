//Write a program on replace() method using StringBuffer Class"
package Assignments;

public class Assignment131 {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Welcome to Grotechminds");
        System.out.println("string buffer = " + sbf);
 
        // Replacing substring from index 15 to index 18
        sbf.replace(15, 18, "for");
 
        System.out.println("After replacing string buffer= " + sbf);
	}

}
