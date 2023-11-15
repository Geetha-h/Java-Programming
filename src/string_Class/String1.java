package string_Class;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Geetha";
		String s2 = "GeethaCK";
		
		String s3 = new String("New");  // this will create object in 2 places
		// 1. in heap, since we are using new keyword
		// 2. in string pool 
		
		System.out.println("String of s1 " + s1);
		System.out.println("String of s2 " + s2);
		System.out.println("String of s3 " + s3);
					

	}

}
