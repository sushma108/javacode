package corejava;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  char gender='M';
  int age=21;
  if(gender=='M'&& age>=12)
  {
	 System.out.println("Full Ticket"); 
  }
   if(gender=='F'&& age>=12)
   {
	   System.out.println("Full Ticket");
   }
   else
   {
	   System.out.println("half ticket");
   }
	}

}
