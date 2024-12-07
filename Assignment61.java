//Write a program to check which method access specifiers are accessable inside the package.
package Assignments;


public class Assignment61 {

	public void sub()
	{
		System.out.println("AS accessable inside the package");
	}
	protected void mul()
	{
		System.out.println("AS accessable inside the package");

	}
	void div()
	{
		System.out.println("AS accessable inside the package");

	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment61 A1 = new Assignment61();
		A1.sub();
		A1.mul();
		A1.div();


	}

}
