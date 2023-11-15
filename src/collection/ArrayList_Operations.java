package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Operations {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		System.out.println(list1.isEmpty()); //true
		System.out.println(list1.size()); // 0 
		
		list1.add("Mango");
		list1.add("Apple");
		list1.add("blueberry");
		list1.add("Sapota");
		
		System.out.println(list1.isEmpty()); //false
		System.out.println(list1.size()); // 3 (index starts from 0)
		
		System.out.println(list1);
		
		list1.add("GreenApple"); //This will add the item at the end of the list
		System.out.println(list1);
		
		list1.remove(0); // will remove the item in the index 0
		System.out.println(list1);
		
		list1.remove("Sapota"); //Will remove the item with the item name
		System.out.println(list1);
		
		list1.add(1, "kiwi");  //add the item at index 1 , other items will move to right
		System.out.println(list1);
		
		list1.set(0, "butterFruit");  // it will remove the item in index 0 and add the 'butterFruit' 
		System.out.println(list1);
		

	}

}
