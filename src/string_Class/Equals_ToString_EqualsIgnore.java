package string_Class;

public class Equals_ToString_EqualsIgnore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Geetha";
		String s2 = "Geetha";
		String s3 = "geetha";
		
		System.out.println(s1.equals(s2));  // true
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		
		
		System.out.println(s1);
		System.out.println(s1.toString()); 
		// toString() is overridden in string class, it will return the string value
			
		
	}

}
