//Write a program to find out Circumference of Square using scanner class"
package Assignments;

import java.util.Scanner;

public class Assignment46 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the side length of the square:");
	        double side = scanner.nextDouble();

	        double circumference = 4 * side;

	        System.out.println("The circumference of the square is: " + circumference);
	}

}
