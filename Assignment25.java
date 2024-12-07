//"Write a program on method Overloading and consturctor overloading"
package Assignments;

public class Assignment25 {
	Assignment25()
	{
		System.out.println("This is first constructor");
	}
	Assignment25(int a)
	{
		System.out.println("This is second constructor");
	}
	Assignment25(String s)
	{
		System.out.println("This is 3rd constructor");
	}
	
	static void add()
	{
	System.out.println("This is first method");	
	}
	static void sub()
	{
	System.out.println("This is 2nd method");	
	}
	static void mul()
	{
	System.out.println("This is 3rd method");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   add();
   sub();
   mul();
  new  Assignment25();
  new  Assignment25(22);
  new  Assignment25("sushma");

  
	}

}
