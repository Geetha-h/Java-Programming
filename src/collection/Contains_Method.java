package collection;

import java.util.ArrayList;
import java.util.List;

public class Contains_Method {

	public static void main(String[] args) {
		
		List<String> menu2=new ArrayList<String>();
		menu2.add("Idly");
		menu2.add("Vade");
		menu2.add("Masala Dose");
		menu2.add("Poori");
		menu2.add("Upma");
		menu2.add("BBBath");
		
		String s1="Masala Dose";
		System.out.println(s1.contains("Dose"));//true
		
		System.out.println(menu2.contains("Dose"));//false , looks for complete string in the list
		System.out.println(menu2.contains("Masala Dose"));//true
		System.out.println(menu2.contains("idly"));//false, case sensitive
		
		List<String> menu3=new ArrayList<String>();
		menu3.add("Idly");
		menu3.add("Vade");
		
		System.out.println(menu2.containsAll(menu3));//true, the items in menu3 present in menu2
		
		menu3.add("Pizza");
		System.out.println(menu2.containsAll(menu3));//false 
	}

}
