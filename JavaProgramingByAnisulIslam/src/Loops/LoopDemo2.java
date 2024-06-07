package Loops;

import java.util.Scanner;

public class LoopDemo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m, n;
		int sum= 0;
		
		System.out.println("Enter value for m: ");
		m= sc.nextInt();
		
		System.out.println("Enter value for n: ");
		n= sc.nextInt();
		
		for(int i=m; i<=n; i++) {
			
			if(i % 2 == 0) {
				
				sum= sum + i;
				System.out.print(i);
			}
		
			System.out.println("Sum of all even numbers: "+ sum);
		}

	}

}
