//"Write a program on Thread Class Method
package Assignments;
import java.lang.Thread;


public class Assignment30 extends Thread{



		    public void run() {
		        System.out.println("Thread is running: " + Thread.currentThread().getName());
		    }

		    public static void main(String[] args) {
		        Assignment30 thread1 = new Assignment30();
		        Assignment30 thread2 = new Assignment30();

		        thread1.setName("Thread 1");
		        thread2.setName("Thread 2");

		        System.out.println("Thread 1 is alive: " + thread1.isAlive());

		        thread1.start();
		        thread2.start();

		        try {
		            thread1.join(); // Wait for thread1 to finish
		            thread2.join(); // Wait for thread2 to finish
		        } catch (InterruptedException e) {
		            System.out.println("Interrupted: " + e.getMessage());
		        }

		        System.out.println("Thread 1 is alive: " + thread1.isAlive());
		

	}

}
