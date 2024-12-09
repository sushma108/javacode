package corejava;

import java.util.Date;

public class PresentTime 
{
public static void main(String[] args)
{
	 Date d1=new Date();
	 System.out.println(d1.getTime());
	 Date d2=new Date(d1.getTime() -(1000*60*60*24*3));//current time
	 System.out.println(d2);
	 
	 String humantime=	d2.toString();
	 String month=	humantime.substring(4, 7);
	System.out.println(month);
	String date=	humantime.substring(8,10);
	System.out.println(date);
	String year=	humantime.substring(humantime.length()-4);
	System.out.println(year);
	
	String format1=	date.concat(month).concat(year);
	System.out.println(format1);
	String format2=	date.concat(" ").concat(month).concat(" ").concat(year);
	System.out.println(format2);
	String format3=	date.concat("-").concat(month).concat("-").concat(year);
	System.out.println(format3);
	String format4=	date.concat("/").concat(month).concat("/").concat(year);
	System.out.println(format4);
}
}
