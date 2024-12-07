//Write a program which contains 1 abstract class, inside that abstract class mention 2 abstract method, 
//1 concrete non static method,1 concrete static method. override 
//the non static methods(abstract menthods+non static concrete method) and call all the methods 
//in main method to execute."
package Assignments;
abstract class one
{
	abstract void addemployee();
	abstract void addsalary();
	void addstudentname()
	{
		System.out.println("parent class");
	}
	static void checkStudentDetails()
	{
		System.out.println("Non static method");
	}
}

public class Assgnment64 extends one{
	@Override
void addemployee()
{
	System.out.println("Employee Details");
}
@Override
void addsalary() {
System.out.println("Salary Details");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkStudentDetails();
		Assgnment64 a1 = new Assgnment64();
		a1.addemployee();
		a1.addsalary();
		a1.addstudentname();
	}
	

}
