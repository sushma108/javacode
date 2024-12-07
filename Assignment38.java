//Write a program to do declaration and initialisation of all methods of Scanner class"
package Assignments;

import java.util.Scanner;

public class Assignment38 {

	public static void main(String[] args) {
		// Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Read different types of data
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();

        System.out.println("Enter a double:");
        double decimal = scanner.nextDouble();

        scanner.nextLine(); // Consume the remaining newline character

        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();

        System.out.println("Enter a word:");
        String word = scanner.next();

        System.out.println("Enter a boolean value:");
        boolean bool = scanner.nextBoolean();

        // Close the scanner
        scanner.close();

        // Print the values
        System.out.println("Integer: " + num);
        System.out.println("Double: " + decimal);
        System.out.println("Line: " + line);
        System.out.println("Word: " + word);
        System.out.println("Boolean: " + bool);
    }
}
	