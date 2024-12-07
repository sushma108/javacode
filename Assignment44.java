//Write a program to find out Circumference of circle using scanner class"
package Assignments;

import java.util.Scanner;

public class Assignment44 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println("The circumference of the circle is: " + circumference);

        scanner.close();

	}

}
