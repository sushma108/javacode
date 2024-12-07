//Write a program on delete() method using StringBuffer Class"
package Assignments;

public class Assignment132 {

	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("VIVAANRPATELL"); 
        System.out.println("string buffer = " + sbf); 
  
        sbf.delete(6, 13); 
        System.out.println("After deletion string buffer is = " + sbf); 
	}

}
