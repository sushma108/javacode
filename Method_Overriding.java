package corejava;
class flipkart
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
}
public class Method_Overriding extends flipkart
{
 void login()
 {
	 System.out.println("login with email");
	 super.login();
 }
	public static void main(String[] args)
	{
		Method_Overriding m1 = new Method_Overriding();
		m1.login();
		

	}

}
