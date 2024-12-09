package corejava;

public class Average_value_of_array {

	public static void main(String[] args) {
 double age[]=new double[5];
 age[0]=22;
 age[1]=25;
 age[2]=29;
 age[3]=38;
 age[4]=24;
 double sum=0;
 for(int i=0;i<age.length;i++)
 {
sum=sum+age[i];
 }
System.out.println(sum);
double average=sum/age.length;
System.out.println(average);
 
	}

}
