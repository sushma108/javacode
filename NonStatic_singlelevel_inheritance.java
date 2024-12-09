package corejava;
class parent1
{
	 void add()
	{
		
	}
}

public class NonStatic_singlelevel_inheritance extends parent1
{
	 void sub()
	{
		
	}

	public static void main(String[] args) 
	{
		// always create an object with child class
		NonStatic_singlelevel_inheritance s1 = new NonStatic_singlelevel_inheritance();
     s1.sub();
     s1.add();
	}

}
