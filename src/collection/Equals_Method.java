package collection;

import java.util.ArrayList;
import java.util.List;

public class Equals_Method {

	public static void main(String[] args) {
		
		List<String> menu1=new ArrayList<String>();
		menu1.add("Idly");
		menu1.add("Vade");
		menu1.add("Poori");

		List<String> menu2=new ArrayList<String>();
		menu2.add("Idly");
		menu2.add("Vade");
		menu2.add("Poori");
												// menu1 and menu2 all the elements and order and case is same
		System.out.println(menu1.equals(menu2)); // true, checks for the same elements are available
		
		List<String> menu3=new ArrayList<String>();
		menu3.add("Poori");
		menu3.add("Idly");
		menu3.add("Vade");
												// menu1 and menu3 all the elements and case is same but order is different
		System.out.println(menu1.equals(menu3)); // false, checks for the same elements are available
		
		List<String> menu4=new ArrayList<String>();
		menu4.add("idly");
		menu4.add("vade");
		menu4.add("poori");
		
		System.out.println(menu1.equals(menu4));//menu1 and menu4 elements and order is same but case is different 
												// false
		
		List<String> menu5=new ArrayList<String>();
		menu5.add("Idly");
		menu5.add("Vade");
		menu5.add("Poori");
		menu5.add("Dose");
		System.out.println(menu1.equals(menu5)); // false, in menu5 size is diff, 4 elements
		
		System.out.println(menu5.containsAll(menu1)); //true
	}

}
