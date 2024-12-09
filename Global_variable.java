package corejava;

public class Global_variable {
	static int age;
	static boolean answer;
    static double pi=3.14; //global variable
    static void add()
    {
    	double area=pi*10*10;
    	System.out.println(area);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(age);
		System.out.println(answer);
  double area1=pi*12*12;
  System.out.println(area1);
  add();
 
	}

}
