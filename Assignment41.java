//Write a program to find out area of  rectangle using scanner class"
package Assignments;

import java.util.Scanner;

public class Assignment41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = length * width;

        System.out.println("The area of the rectangle is: " + area);

        scanner.close();

	}

}
