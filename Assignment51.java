//Write a Program for Multi Level Inheritance"
package Assignments;
class Shape {
	   void display() {
	      System.out.println("Inside display");
	   }
	}
	class Rectangle extends Shape {
	   void area() {
	      System.out.println("Inside area");
	   }
	}
	class Cube extends Rectangle {
	    void volume() {
	      System.out.println("Inside volume");
	   }
	}
public class Assignment51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cube cube = new Cube();
	      cube.display();
	      cube.area();
	      cube.volume();
	}

}
