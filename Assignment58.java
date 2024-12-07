//Write a program for method overriding usig super keyword"
package Assignments;
class Base
{
    void get()
    {
        System.out.println(" Base class method via Super keyword");
    }
}

    

public class Assignment58 extends Base{
	void get()
    {
       super.get();
       System.out.println("Child class method");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment58 obj1 = new Assignment58();
	       obj1.get();
	}

}
