package string_Class;

public class Split_Join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String msg = "java is very easy to learn";
		String[] s = msg.split(" ");   // split it and store it in string array
		for(String v:s) {
			System.out.println(v);
		}
		
		String res = String.join("-", s); //takes the string. join() method is static method in string
		System.out.println(res);
				
		String s1 = "RainRainGoAway";
		 String[] r1 = s1.split("a"); // it will split where char 'a' is present
		 
		 for(String r : r1) {
			 System.out.println(r);
		 }	
	}
	
}
