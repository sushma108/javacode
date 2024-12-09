package corejava;

public class Constructor {
	Constructor()
	{
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor c1 = new Constructor();// this is one way to create an object
new Constructor(); //this is another way to cretae an object but we cant call non static method
	}

}
