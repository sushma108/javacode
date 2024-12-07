//Write a program on sort method in collection class for String values ."
package Assignments;

import java.util.Arrays;
import java.util.Comparator;

public class Assignment115 {
	// Method 1
    // To sort a mixed string
    public static String sortString(String inputString)
    {
        // Converting input string to Character array
        Character tempArray[]
            = new Character[inputString.length()];

        for (int i = 0; i < inputString.length(); i++) {
            tempArray[i] = inputString.charAt(i);
        }

        // Sort, ignoring case during sorting
        Arrays.sort(tempArray, new Comparator<Character>() {
            
          // Method 2
            // To compare characters
            @Override
            public int compare(Character c1, Character c2)
            {
                // Ignoring case
                return Character.compare(
                    Character.toLowerCase(c1),
                    Character.toLowerCase(c2));
            }
        });

        // Using StringBuilder to convert Character array to
        // String
        StringBuilder sb
            = new StringBuilder(tempArray.length);

        for (Character c : tempArray)
            sb.append(c.charValue());

        return sb.toString();
    }

	public static void main(String[] args) {
		// Custom input string
        String inputString = "GROTECHMINDS";

        // Calling method 1 to sort input string
        // and storing in a string
        String outputString = sortString(inputString);

        // Print and display the input and output strings
        System.out.println("Input String : " + inputString);
        System.out.println("Output String : "
                           + outputString);
		
	}

}
