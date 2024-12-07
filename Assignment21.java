//Write a program to create a class consist of static ,
//Non Static and constructor method 
//and call each of them in a non parameterized way."
package Assignments;

public class Assignment21 {
  Assignment21()
  {
	  System.out.println("This is constructor method");
  }
  static void add()
  {
	  System.out.println("this is static method");
  }
  void sub()
  {
	  System.out.println("this is non static method");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //new Assignment21();
     add();
     Assignment21 a1 = new Assignment21();
     a1.sub();

	}

}
