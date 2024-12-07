//Write a program to check which method access specifiers are accessable inside same class
package Assignments;

public class Assignment60 {
	private void add()
	{
		System.out.println("Private method access specifier are accessable inside the same class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment60 a1 =new Assignment60();
      a1. add();
	}

}
