package corejava;

public class Parametrized_methods {
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
   static void sub(int a, int b)
   {
	System.out.println(a-b);   
   }
   static void login(String un, String pw)
   {
	   System.out.println("login to RS");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		add(4,7);
		sub(4,3);
		login("sushmavm.305@gmail.com","Sushma@123");
	}

}
