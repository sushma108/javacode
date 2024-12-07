//Write a program to find out Circumference of rectangle using scanner class"
package Assignments;

import java.util.Scanner;

public class Assignment45 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();

        double circumference = 2 * (length + width);

        System.out.println("The circumference of the rectangle is: " + circumference);

        scanner.close();
    }
	}


