package String;

public class StringDemaos {

	/*
	 * String is a class for representing sequence of character and it is used for creating and manipulating strings.
	 * String methods-concat(),charAt(),contains(),endsWith(),indexOf(),
	 * LastIndexOf(),length(),replace(),split(),subString(),valueOf(),toUpperCase(),toLowerCase()
	 */
	
	public static void main(String[] args) {
		
		char c='a';
		//Using char[] array
		char[] arr={'j','a','v','a'};
		System.out.println(arr);
		
		//Using String
		String str= "java";
		System.out.println(str);
		
		//How to create String
		//1.Using String Literal
		String str1= "java";
		String str3= "JAVA";
		
		//2.Using new keyword
		String str2= new String("java");
		System.out.println(str2);
		
		//Compare (space): two strings
		System.out.println(str1==str2);
		
		//Compare (value): two strings
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
		
		String str4= str1+str3;
		System.out.println(str4);

	}

}
