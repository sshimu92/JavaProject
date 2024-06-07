package series;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		
		double n;
		double sum= 0;
		
		System.out.print("Enter the last number: ");
		
		n= sc.nextDouble();
		
		for(double i=1.5; i<=n; i+=2) {
			
			System.out.print(i +" ");
			sum= sum + i;
		}
	
		System.out.println("="+" "+ sum);
	}
	}

