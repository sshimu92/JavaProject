package String;

import java.util.Scanner;

public class VowelPresence {


	/*
	 * program algorithm
	 * 
	 */
	
	public static void main(String[] args) {
		
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the string");
     String str= sc.nextLine();
     boolean flag= false;
     
     for(int i=0; i<str.length(); i++) {
    	 
    	 if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='0'||str.charAt(i)=='u') {
    		 
    		 flag= true;
    		 System.out.println("The given string contains a vowel");
    		 break;
    	 }
    	 
     } 
		
		
	}

}
