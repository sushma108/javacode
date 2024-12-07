//Write a program for constructor inheritance- single level using a parameterized 
//super calling statement with explicit invocation"
package Assignments;
class super_calling_explict
{
	super_calling_explict(int a)
	{
		System.out.println("constructor1");
	}
}
class flip extends super_calling_explict
{
flip(String name)
{
	super(1);
	System.out.println("constructor2");
}
}
public class Assignment55 extends flip {
	Assignment55()
	{
		super("sushma");
		System.out.println("constructor3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 new Assignment55();
	}

}
