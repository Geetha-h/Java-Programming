package string_program_practice;

public class uppercase_without_builtin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "geetha chethan";
		for (char c : s.toCharArray()) {
			if ( c>='a'&& c<='z') {
				int i = c-32;
				char a = (char)i; //Auto widening 
				System.out.print(a);
			}
			else {
				System.out.print(c);
			}
		}
	}

}
