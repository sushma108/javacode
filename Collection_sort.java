package corejava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Collection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> c1 = new ArrayList<String>();
		c1.add("cat");
		c1.add("dog");
		c1.add("horse");
		c1.add("rat");
		c1.add("elephant");
		System.out.println("before sorting" + c1);

		Collections.sort(c1);
		System.out.println("after sorting" + c1);
	}

}
