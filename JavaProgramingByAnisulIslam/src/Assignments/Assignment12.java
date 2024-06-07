package Assignments;

import java.util.Scanner;

public class Assignment12 {

	//Print sum of odd numbers from m-n.
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int m,n;
		
		System.out.println("Enter the value of m: ");
		m= sc.nextInt();
		
		System.out.println("Enter the value of n: ");
		n= sc.nextInt();
		
		int sum=0;
				
		for(int i=m; i<=n; i++) {
			
			if(i %2  != 0) {
				
			 sum= sum + i;
		}
		
			System.out.println("The sum of odd numbers between " + m + " and " + n + " is " + sum);
	}
		
		
	}
}
