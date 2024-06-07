package PracticeQuestionsGivenByKiruba;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int n= sc.nextInt();
		
		int term1= 0;
		int term2= 1;
		
		System.out.println("Fibonacci Series: "+ term1);
		System.out.println("Fibonacci Series: "+ term2);
		
		int i= 2;
		
		while(i<n) {
			
			int nextTerm= term1 + term2;
			
			System.out.println(nextTerm);
			
			term1= term2;
			term2= nextTerm;
			
			i++;
		}

	}

}
