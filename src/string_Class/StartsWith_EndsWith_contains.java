package string_Class;

public class StartsWith_EndsWith_contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://www.google.com";
		
		System.out.println(url.startsWith("http"));  //true
		System.out.println(url.startsWith("https")); //false
		
		System.out.println(url.contains("google"));  //true
		System.out.println(url.contains("www"));     //true
		
	
		System.out.println(url.endsWith(".com"));
		
		
	}

}
