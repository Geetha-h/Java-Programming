package string_program_practice;

public class Print_S_vertically 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Geetha";
		System.out.println("String length is "+ s.length());
		
		for (int i=0; i<s.length(); i++) {
			      char v = s.charAt(i);
			      System.out.println(v);
		}
		System.out.println("--------");
		char[] v = s.toCharArray();
		 for(char a : v) {
			 System.out.println(a);
		 }		 
	}

}
