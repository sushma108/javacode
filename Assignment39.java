//Write a program to find out area of  triangle using scanner class"
package Assignments;

import java.util.Scanner;

public class Assignment39 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the base of the triangle:");
    double base = scanner.nextDouble();

    System.out.println("Enter the height of the triangle:");
    double height = scanner.nextDouble();

    double area = 0.5 * base * height;

    System.out.println("The area of the triangle is: " + area);

    scanner.close();
}
}
