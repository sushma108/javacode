//Write a program to do Addition,Subtraction,Multiplication,
//and Division and Modulus using Scanner class with 2 variables"
package Assignments;

import java.util.Scanner;

public class Assignment37 {

		 
		 public static void main(String[] args) {
		  // Create a Scanner object to read input from the user
		  Scanner in = new Scanner(System.in);
		   
		  // Prompt the user to input the first number
		  System.out.print("Input first number: ");
		  // Read and store the first number
		  int num1 = in.nextInt();
		  int num2 = in.nextInt();
		   
		  // Prompt the user to input the second number
		  System.out.print("Input second number: ");
		  // Read and store the second number
		   
		  // Calculate and print the sum of the two numbers
		  System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		   
		  // Calculate and print the difference of the two numbers
		  System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		   
		  // Calculate and print the product of the two numbers
		  System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
		   
		  // Calculate and print the division of the two numbers
		  System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		 
		  // Calculate and print the remainder of the division of the two numbers
		  System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
		 }
		} 
