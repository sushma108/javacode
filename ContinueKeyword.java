package corejava;

public class ContinueKeyword {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i;
        for(i=1;i<11;i++)
        {
        	if(i==4)
        	{
        		continue; //skipping 7
        	}
        	if(i>=7)
        	{
        		continue;
        	}
        	System.out.println(i);
        }
	}

}
