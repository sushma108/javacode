//Write a program where the non static global variable datatype used are same as local variable. 
//Use non static method to use the local variable in method. Use 
//this key word to update the global variable value same as local variable."
package Assignments;

public class Assignment59 {
int age;
String height;
char gender;
void EmployeeDetails(int a,String h,char c)
{
	this.age=a;
	this.height=h;
	this.gender=c;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment59 c=new Assignment59();
		c.EmployeeDetails(90, "sushma", 'v');
		System.out.println(c.age);
		System.out.println(c.height);
		System.out.println(c.gender);
	}

}
