package string_program_practice;

public class Lowercase_Without_builtin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "GEETHA CHETHAN";
		for (char c : s.toCharArray()) {
			if ( c>='A'&& c<='Z') {
				int i = c+32;
				char a = (char)i; //Auto widening 
				System.out.print(a);
			}
			else {
				System.out.print(c);
			}
		}

	}

}
