//Write a program to find out area of  Circle using scanner class"
package Assignments;

import java.util.Scanner;

public class Assignment40 {

	public static void main(String[] args) {
		int r; 
		double pi = 3.14, area;
		Scanner s = new Scanner(System.in); 
		System. out. print("Enter radius of circle:"); 
		r = s. nextInt(); 
		area = pi * r * r;
		System.out.println(area);
	}

}
