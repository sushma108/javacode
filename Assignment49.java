//Write a program for single-level inheritance using a Non-static method in the 
//same class name in the single package explorer."
package Assignments;
class SLI{
	void add()
	{
		System.out.println("a+b");
		
	}
}

public class Assignment49 extends SLI {
	void mul()
	{
		System.out.println("a*b");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Assignment49 s1 = new Assignment49();
s1.add();
s1.mul();
	}

}
