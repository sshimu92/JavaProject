
package HomeWork;

import java.util.Scanner;

public class VowelCount {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the string: ");
		
		String intputString= sc.nextLine();
		
		int vowelCount= countVowels(intputString);
		int consonantCount= intputString.length() - vowelCount;
		
		System.out.println("Number of vowels: "+vowelCount);
		System.out.println("Number of consonant: "+consonantCount);

	}

	public static int countVowels(String str) {
		
		str= str.toLowerCase();
		int count= 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'|| str.charAt(i)=='u') {
				
				count++;
			}
		}
		
	    return count;
		
	}
}
