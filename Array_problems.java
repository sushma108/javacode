package corejava;

import java.util.Arrays;

public class Array_problems {
static int countof_alphabet=0;
static int countof_numeric=0;
static int countof_space=0;


	public static void main(String[] args) {
      String a="Kv no 2 $@&";
      char c1[]=     a.toCharArray();
      System.out.println(Arrays.toString(c1));
      for(int i=0;i<a.length();i++)
      {
      boolean v1= Character.isAlphabetic(c1[i]);
      boolean v2= Character.isDigit(c1[i]);
      boolean v3= Character.isWhitespace(c1[i]);

      //System.out.println(v2);
      if(v1==true)
      {
    	  countof_alphabet++;
      }
     // System.out.println(v1);
      if(v2==true)
      {
    	  countof_numeric++;
      }
      if(v3==true)
      {
    	  countof_space++;
      }
      }
      System.out.println("The count of alphabet in the given array==" +countof_alphabet);
      System.out.println("The count of numeric in the given array==" +countof_numeric);
      System.out.println("The count of space in the given array==" +countof_space);
     int countof_special=c1.length-(countof_alphabet+countof_numeric+countof_space);
     System.out.println("The count of special character in the given array==" +countof_special);
	}

}
