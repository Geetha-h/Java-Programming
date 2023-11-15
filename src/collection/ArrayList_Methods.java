package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Methods {

	public static void main(String[] args) {
		
		List<String> menu1=new ArrayList<String>();
		menu1.add("coffee");
		menu1.add("tea");
		System.out.println(menu1);
		System.out.println("---");
		
		List<String> menu2=new ArrayList<String>();
		menu2.add("Idly");
		menu2.add("Vade");
		menu2.add("Dose");
		menu2.add("Poori");
		menu2.add("Upma");
		menu2.add("BBBath");
		System.out.println(menu2);
		System.out.println("---");
		
		menu2.addAll(menu1);  // all one collection to another ( adding menu1 to menu2)
		System.out.println(menu2);
		
		menu2.removeAll(menu1);  // removing all the elements of menu1 in menu2
		System.out.println(menu2);
		
		menu2.clear();   // clearing the collection
		System.out.println(menu2.isEmpty());
		System.out.println(menu2.size());
		System.out.println(menu2);
	}

}
