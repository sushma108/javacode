package corejava;
class ParentClass
{
	final void add()
	{
		System.out.println("adding t numbers");
	}
}
public class Final_Keyword extends ParentClass {
	//void add() // Cannot override the final method from ParentClass
     
	void add(int b, int a, int c)
	{
		System.out.println("adding three num");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final_Keyword m1 = new Final_Keyword();
		m1.add();
	}

}
