package primeNumber;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int m,n; 
		int count= 0;
		int totalPrime= 0;
		
		
		System.out.print("Enter Initial Number: ");
		m= sc.nextInt();
		
		System.out.print("Enter Ending Number: ");
		n= sc.nextInt();
		
		for(int i=m; i<=n; i++) {
			
			for(int j=2; j<=i-1; j++) {
				
				if(i % j == 0) {
					
					count++;
					break;
				}
				
			}
		
			if (count == 0) {
				
				System.out.println(i);
				
				totalPrime++;
				
			}
		
			count= 0;
		}
		
		System.out.println("Total prime number = "+ totalPrime);
	}
}
