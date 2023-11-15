package string_program_practice;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "mom";
		String reverse = "";
		
		for(int i = 0; i<s.length(); i++) {
			char v = s.charAt(i);
			reverse = v+reverse;
		}
		
		System.out.println(s);
		System.out.println(reverse);
		if(s.equalsIgnoreCase(reverse)) {
			System.out.println("Given String is - "+s+ " , it is a palindrome");
		}
		else {
			System.out.println("Given String is - "+s+ " , it is not a palindrome");
		}
		
	}

}
