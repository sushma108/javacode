//Write a program for constructor - single level inheritance using a non-parameterized 
//super calling statement with explicit invocation"
package Assignments;
class Person { 
    Person() 
    { 
        System.out.println("Person class Constructor"); 
    } 
} 

public class Assignment54 extends Person{
	Assignment54() 
	 { 
	     // invoke or call parent class constructor 
	     super(); 

	     System.out.println("Student class Constructor"); 
	 } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment54 s = new Assignment54(); 

	}

}
