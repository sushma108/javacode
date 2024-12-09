package corejava;
public class NonStaticParametrized 
{
	void add(int a,int b,int c,int d)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void main(String[] args) 
	{
		NonStaticParametrized n1=new NonStaticParametrized();
		n1.add(100, 10,5,7);
		n1.sub(100, 50);
		
		
	}

}
