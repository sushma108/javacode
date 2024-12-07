//Write a Program for hierarchical Level Inheritance"
package Assignments;
class Vehicle	// Parent class
{
	void display()
	{
		System.out.println("This is a Vehicle");
	}
}
class Car extends Vehicle	// Child class 1
{
	void displayCar()
	{
		System.out.println("This is a Car");
	}
}
class Motorcycle extends Vehicle	// Child class 2
{
	void displayMotorcycle()
	{
		System.out.println("This is a Motorcycle");
	}
}

public class Assignment52 {                   //main class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();	// Create objects of child classes
		Motorcycle motorcycle = new Motorcycle();
 
		car.display();	// Calling methods of parent class
		motorcycle.display();
 
		car.displayCar();	// Calling methods of child classes
		motorcycle.displayMotorcycle();
	}

}
