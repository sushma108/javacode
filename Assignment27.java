//Write a program to create a class with 5 methods addition, subtraction, multiplication, 
//division, modulus.//Create 2 global variable a & b and perform the operation without 
//involving 3rd variable."
package Assignments;

public class Assignment27 {
	int a=30; //global variable
	int b=20;   // global variable

  void add()
 {
	System.out.println(a+b); 
 }
  void sub()
 {
	 System.out.println(a-b);
 }
  void mul()
 {

	 System.out.println(a*b);
 }
  void div()
 {
	 System.out.println(a/b);
 }
  void mod()
 {
	 System.out.println(a%b);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment27 m5 = new Assignment27();
 m5.add();
 m5.sub();
 m5.mul();
 m5.div();
 m5.mod();
 
 
	}

}
