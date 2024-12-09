package corejava;

public class ConstructorOverloadding {
	ConstructorOverloadding(double a)
	{
	System.out.println("This is 1st onstructor");	
	}
	ConstructorOverloadding(int a)
	{
		System.out.println("This is 2nd Constructor");
	}
	ConstructorOverloadding(int a, String b)
	{
		System.out.println("This is 3rd constructor");
	}
	ConstructorOverloadding()
	{
		System.out.println("This is 4th constructor");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloadding c1 = new ConstructorOverloadding(90);
		new ConstructorOverloadding(30.5);
		new ConstructorOverloadding();
		new ConstructorOverloadding(90, "sushma");
		
	}
}
