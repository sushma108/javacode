//Write a program for constructor inheritance- Multi level using a parameterized 
//super calling statement with explicit invocation"
package Assignments;
class A {
	   A(int a) 
	   {
	      System.out.println("This is constructor of class A");
	   }
	}
class B extends A {
	   B(String name) {
		   super(1);
	      System.out.println("This is constructor of class B");
	   }
	}

public class Assignment56 extends B {
	Assignment56()
	{
		super("sushma");
		System.out.println("This is constructor of class Assignment56");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
new Assignment56();
	}

}
