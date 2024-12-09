package corejava;

public class This_Calling {
	This_Calling(double a)
	{
	System.out.println("This is 1st onstructor");	
	}
	This_Calling(int a)
	{
		System.out.println("This is 2nd Constructor");
	}
	This_Calling(int a, String b)
	{
		System.out.println("This is 3rd constructor");
	}
	This_Calling()
	{
		
		System.out.println("This is 4th constructor");
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Calling c1 = new This_Calling(90);
		new This_Calling(30.5);
		new This_Calling();
		new This_Calling(90, "sushma");
		
	}
}