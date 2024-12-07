//Write a program on method Overloading with 5 static method and 5 non static method""
package Assignments;

public class Assignment24 {
static void add(int a)
{
	System.out.println("static method1");
}
static void add(double a)
{
	System.out.println("static method2");
}
static void add()
{
	System.out.println("static method3");
}
static void add(String c)
{
	System.out.println("static method 4");
}
static void add(char a)
{
	System.out.println("static method5");
}
 void sub(int a)
{
	System.out.println("Non static method1");
}
 void sub(double a)
{
	System.out.println("Non static method2");
}
void sub()
{
	System.out.println("Non static method3");
}
void sub(String c)
{
	System.out.println("Non static method 4");
}
void sub(char c)
{
	System.out.println("Non static method5");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    add(10);
    add(3.5);
    add();
    add("sushma");
    add('a');
    Assignment24 m1 = new Assignment24();
    m1.sub(2);
    m1.sub('a');
    m1.sub(3.5);
    m1.sub("sushma");
    m1.sub();
	}

}
