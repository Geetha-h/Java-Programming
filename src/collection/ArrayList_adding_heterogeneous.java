package collection;

import java.util.ArrayList;

/* ArrayList  a1 = new ArrayList()
 * By declaring like this, we can store any type of data. 
 * 
 */

public class ArrayList_adding_heterogeneous {

	public static void main(String[] args) {
		
		ArrayList  a1 = new ArrayList();
		a1.add("I'm a String");
		a1.add(10);
		a1.add(true);
		System.out.println(a1);

	}

}
