package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Duplicate_elements {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();

		list1.add("Mango");
		list1.add("Apple");
		list1.add("blueberry");
		list1.add("Sapota");
		list1.add("Apple");
		
		System.out.println(list1);
		
		list1.remove("Apple"); // if we have duplicate elements, it will remove the 1st occurence
		
		// want to remove the last element
		int count = list1.size();
		list1.remove(count-1);
		
		System.out.println(list1);
		
	}

}
