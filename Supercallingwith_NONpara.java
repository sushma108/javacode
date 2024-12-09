package corejava;
class Amazon
{
	Amazon()
	{
		System.out.println("constructor 1");
	}
}
public class Supercallingwith_NONpara extends Amazon {
	Supercallingwith_NONpara()
	{
		
		System.out.println("constructor 2");
	}

	public static void main(String[] args) {
          new Supercallingwith_NONpara();
	}

}
