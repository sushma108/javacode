//Write a program on Append() method using StringBuffer Class"
package Assignments;
import java.lang.*; 
public class Assignment129 {

	public static void main(String[] args) {
		StringBuffer sbf1 = new StringBuffer("append method using string buffer class"); 
        System.out.println("Input: " + sbf1); 
  
        // Appending the boolean value 
        sbf1.append(true); 
        System.out.println("Output: " + sbf1); 
  
        System.out.println(); 
  
        StringBuffer sbf2 = new StringBuffer("We are lost - "); 
        System.out.println("Input: " + sbf2); 
  
        // Appending the boolean value 
        sbf2.append(false); 
        System.out.println("Output: " + sbf2);
	}

}
