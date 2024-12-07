// Write a program to update value of local and static global variable and non static global variable."
package Assignments;

public class Assignment26 {
	static int a1=20;
	static int b2=30;
	int c=30;
	int d=20;
 static void add()
 {
	 System.out.println(a1+b2);
 }
 void sub()
 {
	 System.out.println(c-d);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20;//local variable
		a=25; //updating local variable
		int b=30;
		System.out.println(a+b);
		a1=50; //updating static global variable
		Assignment26 g1 = new Assignment26();
	    g1.c=80; //updating non static global variable
	    g1.sub();
		add();

	}

}
