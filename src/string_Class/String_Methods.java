package string_Class;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "JavaProgramming";
		String s1 = ""; // it is blank and also empty
		String s2 = "  ";  // it is blank but not empty 
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase()); 
		System.out.println(s.toLowerCase());
		//System.out.println();
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		
		System.out.println(s.isBlank());
		System.out.println(s1.isBlank());
		System.out.println(s2.isBlank());
		
		

	}

}
