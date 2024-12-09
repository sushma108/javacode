package corejava;
public class Throw_keyword_class {

	public static void main(String[] args) throws NullPointerException
	{
		StringBuffer hh=new StringBuffer();
		hh.ensureCapacity(0);
		throw new NullPointerException("Sorry but the file is empty");
	}

}
