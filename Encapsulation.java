package corejava;
class Amazon_properrties
{
	String un="contact@grotechminds.com";
	public String getUn()
	{
		return un;
	}
	public void setUn(String un)
	{
	this.un=un;	
	}
}
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon_properrties a1=new Amazon_properrties();
a1.setUn("mkt@gmail.com");
System.out.println();
	}

}
