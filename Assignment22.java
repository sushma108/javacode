//Write a program on constructor Overloading
package Assignments;

public class Assignment22 {
	Assignment22(double a)
	{
	System.out.println("This is 1st onstructor");	
	}
	Assignment22(int a)
	{
		System.out.println("This is 2nd Constructor");
	}
	Assignment22(int a, String b)
	{
		System.out.println("This is 3rd constructor");
	}
	Assignment22()
	{
		System.out.println("This is 4th constructor");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment22 c1 = new Assignment22(90);
		new Assignment22(30.5);
		new Assignment22();
		new Assignment22(90, "sushma");
		
	}

}
