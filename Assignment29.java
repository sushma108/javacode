//Write a program using different math class methods"
package Assignments;

public class Assignment29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        // Basic arithmetic
		        int max = Math.max(10, 20);
		        int min = Math.min(10, 20);
		        int abs = Math.abs(-10);

		        System.out.println("Max: " + max); // Output: Max: 20
		        System.out.println("Min: " + min); // Output: Min: 10
		        System.out.println("Absolute value: " + abs); // Output: Absolute value: 10

		        // Exponential and logarithmic functions
		        double exp = Math.exp(2);
		        double log = Math.log(10);
		        double pow = Math.pow(2, 3);

		        System.out.println("e^2: " + exp); // Output: e^2: 7.38905609893065
		        System.out.println("ln(10): " + log); // Output: ln(10): 2.302585092994046
		        System.out.println("2^3: " + pow); // Output: 2^3: 8.0

		        // Trigonometric functions
		        double sin = Math.sin(Math.PI / 2);
		        double cos = Math.cos(Math.PI);
		        double tan = Math.tan(Math.PI / 4);

		        System.out.println("sin(π/2): " + sin); // Output: sin(π/2): 1.0
		        System.out.println("cos(π): " + cos); // Output: cos(π): -1.0
		        System.out.println("tan(π/4): " + tan); // Output: tan(π/4): 1.0

		        // Rounding functions
		        double ceil = Math.ceil(2.3);
		        double floor = Math.floor(2.3);
		        long round = Math.round(2.5);

		        System.out.println("ceil(2.3): " + ceil); // Output: ceil(2.3): 3.0
		        System.out.println("floor(2.3): " + floor); // Output: floor(2.3): 2.0
		        System.out.println("round(2.5): " + round); // Output: round(2.5): 3
		    }
		}
	
