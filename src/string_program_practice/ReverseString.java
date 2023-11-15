package string_program_practice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s = "God";
//		for(int i=s.length()-1; i>=0; i--) 
//		{
//			
//			char v = s.charAt(i);
//			System.out.println(v);
//	    }
				

	// Print the string in reverse order but SOP should be executed only once
	 String s = "God";
	 String reverse = "";
	 for(int i=s.length()-1; i>=0; i--) 
	{
		
		char v = s.charAt(i);
		reverse = reverse+v;
		
    }
	 
	 System.out.println(reverse);
	
}
}

