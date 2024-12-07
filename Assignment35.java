//Write a program to perform addition, multiplication, subtraction, and division 
//using a custom Math class"
package Assignments;

public class Assignment35 {
	public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Addition: " + Assignment35.add(num1, num2));
        System.out.println("Subtraction: " + Assignment35.subtract(num1, num2));
        System.out.println("Multiplication: " + Assignment35.multiply(num1, num2));
        System.out.println("Division: " + Assignment35.divide(num1, num2));
    }
}
