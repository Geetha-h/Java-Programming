package string_program_practice;

// Print only upper case letter present in the given string
public class Upper_Case_in_String {

	public static void main(String[] args) {
		
		String s = "Geetha is a SDET Engg";
//		for ( char v :s.toCharArray()) {
//			if (v >= 65 && v<=90) {
//				System.out.println(v);
//			}
//		}
		for(char v : s.toCharArray()) {
			
			if(v>='A' && v<='Z') {
				System.out.print(v + " ");
			}
		}


	}

}
