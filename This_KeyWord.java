package corejava;

public class This_KeyWord {
	int age;
	String name;
	double salary;
	void employee_details(int age,String name, double salary)
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_KeyWord f1 = new This_KeyWord();
		f1.employee_details(18,"sushma",30.2);
		System.out.println(f1.age);
		System.out.println(f1.name);
		System.out.println(f1.salary);

	}

}
