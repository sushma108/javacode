//Write a program to find out Circumference of  triangle using scanner class"
package Assignments;

import java.util.Scanner;

public class Assignment43 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 1:");
        double side1 = scanner.nextDouble();

        System.out.println("Enter the length of side 2:");
        double side2 = scanner.nextDouble();

        System.out.println("Enter the length of side 3:");
        double side3 = scanner.nextDouble();

        double circumference = side1 + side2 + side3;

        System.out.println("The circumference of the triangle is: " + circumference);

        scanner.close();
	}

}
