
//Write a program on method Overloading 
package Assignments;

public class Assignment23 {
	static void add()
	  {
		  System.out.println("method1");
	  }
	  static void add(int a)
	  {
		  System.out.println("method2");

	  }
	  void add(double a)
	  {
		  System.out.println("method3");

	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  add();
  add(20);
  Assignment23 m1 = new Assignment23();
  m1.add(3.1);
	}

}
