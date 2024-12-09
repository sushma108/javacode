package corejava;
class Supercallingwith_para2
{
	Supercallingwith_para2(String name)
	{
		System.out.println("Constructor 1");
	}

}

class Google_Auth1 extends Supercallingwith_para2
{
	Google_Auth1(int a)
	{
		super("SUSHMA");
		System.out.println("constructor 2");
	}
}
public class Supercallingwith_para extends Google_Auth1 {
	Supercallingwith_para()
	{
		super(100);
		System.out.println("constructor 2");
	}
	public static void main(String[] args) {
        new Supercallingwith_para();

	}

}
