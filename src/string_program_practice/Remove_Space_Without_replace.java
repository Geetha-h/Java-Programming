package string_program_practice;

public class Remove_Space_Without_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is easy to learn";
		String[] s1 = s.split(" ");
		String s3 = String.join("", s1);
		System.out.println(s3);
		System.out.println("----------");
		
		//another way
		for(char c : s.toCharArray()) {
			if(c != ' ') {
				System.out.print(c);
			}
		}
		System.out.println();
		
		//another Way
		System.out.println("----------");
		String[] v = s.split(" ");
		 for( String c : v) {
			 
			 System.out.print(c);
		 }
		
		
	}

}
