//Write a program to calculate the area of a circle using a Math class."
package Assignments;

public class Assignment36 {
	static final double PI = Math.PI;
    
    static double findArea(int r)
    {
       return PI * Math.pow(r, 2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Area is " +  findArea(5));

	}

}
