//Write a program to print the value from 1 to 8, but skip the value when a equals 3"
package Assignments;

public class Assignment33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int a = 1; a <= 8; a++) {
            if (a == 3) {
                continue; // Skip to the next iteration of the loop
            }
            System.out.println(a);
        }
	}

}
