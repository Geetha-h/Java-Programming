package collection;

import java.util.ArrayList;

public class ArrayList_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Apple");
		a1.add("Mango");
		a1.add("Banana");
		System.out.println(a1); // it will print the elements in the arraylist
		System.out.println(a1.size()); //size of the list --> 3
		System.out.println(a1.get(0)); 
		System.out.println(a1.get(1));
		System.out.println(a1.get(2));
		System.out.println(a1.get(3)); //IndexOutOfBoundsException
	}

}
