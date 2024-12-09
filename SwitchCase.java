package corejava;

import java.util.Scanner;

public class SwitchCase 
{

	public static void main(String[] args)
	{
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Press 1 to launch Chrome");
		System.out.println("Press 2 to launch mozilla");
		System.out.println("Press 3 to launch Edge");
		System.out.println("Press 4 to launch IE");

		int input=s1.nextInt();
		switch(input)
     {
     case 1:
    	 System.out.println("chrome browser launch");
             break;
     case 2:
    	 System.out.println("mozzila browser launch");
             break;
     case 3:
    	 System.out.println("edge browser launch");
             break;
     case 4:
    	 System.out.println("IE browser launch");
             break;
          default:
        	  System.out.println("your selection is wrong kindley press 1,2,3 and 4 ");
             
     }
	}

}
