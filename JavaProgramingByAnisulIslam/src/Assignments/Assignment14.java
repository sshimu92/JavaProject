package Assignments;

import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		
        Scanner sc= new Scanner(System.in);
		
		int m, n, rev;
		int totalPalindromeNumber= 0;
		
		
		System.out.print("Enter Initial Number: ");
		m= sc.nextInt();
		
		System.out.print("Enter Final Number: ");
		n= sc.nextInt();
		
		for(int i=m; i<=n; i++) {
			
			int temp, sum= 0;
			temp= i;
			
			
			while(temp != 0) {
				
				rev= temp % 10;
				sum= sum * 10 + rev;
				temp= temp / 10;
			}
		
			if(sum == i) {
				
				System.out.println(sum +" ");
				totalPalindromeNumber++;
			}
		
		}
		
		System.out.println("Total Palindrome Numbers: "+ totalPalindromeNumber);

	}

}
