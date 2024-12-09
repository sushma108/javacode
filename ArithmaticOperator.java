package corejava;

public class ArithmaticOperator {
static void addition()
{
int a=100;
int b=200;
int c=a+b;
System.out.println(c);

}
static void sub()
{
	int a=200;
	int b=100;
	int c=a-b;
	System.out.println(c);
}
static void mul()
{
	int a=100;
	int b=200;
	int c=a*b;
	System.out.println(c);
}
static void div()
{
	int a=50;
	int b=25;
	int c=a/b;
	System.out.println(c);
}
static void mod()
{
	int a=51;
	int b=25;
	int c=a%b;
	System.out.println(c);
}
public static void main(String[] args) {
	addition();
	sub();
	mul();
	div();
	mod();
}
}
