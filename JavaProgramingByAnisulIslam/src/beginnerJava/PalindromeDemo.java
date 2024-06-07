package beginnerJava;

import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int num;
		int rev;
		int temporaryNumber;
		int sum= 0;
		
		System.out.print("Enter any integers: ");
		num= sc.nextInt();
		
		temporaryNumber= num;
		
		while(temporaryNumber != 0) {
			
			rev= temporaryNumber % 10;
			sum= sum * 10 + rev;
			temporaryNumber= temporaryNumber / 10;
			
		}

		if(num == sum) {
			
			System.out.println("Palindrome Number");
		
		}else {
			
			System.out.println("Not a palindrome number");
		}
	}

}
