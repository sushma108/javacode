//Write a program for constructor inheritance using the 
//super calling statement with Implicit Invocation"
package Assignments;
//Base Class
		class Programming {
		   
		    // Constructor for class Programming
		    Programming()
		    {
		        System.out.println("Programming");
		    }
		}
		
		 
public class Assignment53 extends Programming {

	Assignment53()
	{
		System.out.println("addidtion");
	}
	public static void main(String[] args) {
		new Assignment53();	
	}

}
