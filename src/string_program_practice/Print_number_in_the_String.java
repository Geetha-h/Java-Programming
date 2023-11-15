package string_program_practice;

// Print only the digits present in the given string - "Page 10 to 20"

public class Print_number_in_the_String {

	public static void main(String[] args) {
		String s = "Page 10 to 20";
		char[] v = s.toCharArray();
		
		for (char a : v) {

			if ( a >= '0' &&  a <='9') {
				  System.out.print(a);
			}
		}


	}

}
