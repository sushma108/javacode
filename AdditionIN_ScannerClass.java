package corejava;

import java.util.Scanner;

public class AdditionIN_ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*	Scanner s1 = new Scanner(System.in);
				int a = s1.nextInt();
				int b = s1.nextInt();
				int sum=a+b;
				System.out.println(sum); */
		//another way for addition
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s1.nextInt();
		System.out.println("Enter the value of a");

		int b = s1.nextInt();
		int sum=a+b;
		System.out.println("Sum of 2 numbers:-" +sum);
		

	}

}
