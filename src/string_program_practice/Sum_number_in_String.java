package string_program_practice;

// find the sum of the numbers in the given string - Page10 to 30  

public class Sum_number_in_String {

	public static void main(String[] args) {
		String s = "Page 10 to 30";
		int sum = 0;
		char[] v = s.toCharArray();
		
		for ( char a :v) {
			
			if(a>='0' && a<='9') {
				//int n = Integer.valueOf(""+a); 
				// here concating string + char and feeding to Integer.valueOf()
				// Integer.valueOf() this method will convert string to integer 
				// We can also use the Character wrapper class
				int n = Character.getNumericValue(a);
				sum = sum+n;
			}
		}
		System.out.println(sum);
		
	}

}
