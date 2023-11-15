package string_Class;

public class IndexOf_CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "New Java Class";
		System.out.println("Given String is -" + s);
		System.out.println("Length of the string " +s+ " is "+ s.length());
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("s"));
		System.out.println(s.indexOf("g"));  // letter is not preset, we get -ve value ( -1 )
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(14)); // StringIndexOutOfBoundsException
		
		
		
	}

}
