package String;

public class Demo2 {

	public static void main(String[] args) {
		
		String country= "  Bangladesh is my country   ";
		System.out.println(country);
		
		String s1= country.trim();
		System.out.println(s1);
		
		char c= country.charAt(0);
		System.out.println(c);
		
		int value= country.codePointAt(0);
		System.out.println(value);
		
		int pos= country.indexOf("is");
		System.out.println(pos);
		
		pos= country.lastIndexOf('n');
		System.out.println(pos);
	}
}
