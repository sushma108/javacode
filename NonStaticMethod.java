package corejava;

public class NonStaticMethod {
	void login()
	{
		System.out.println("login with email id");
	}
  void logout()
  {
	  System.out.println("Logout");
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod m1 = new NonStaticMethod();//sysntax of non static method
		m1.login();
		m1.logout();

	}

}
