package Array;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int[] number= new int[5];
		
		int sum=0;
		
		System.err.println("Please enter five numbers: ");
		
		for(int i=0; i<number.length; i++) {
			
			number[i]= sc.nextInt();
		}
	
		for(int i=0; i<number.length; i++) {
			
			sum= sum + number[i];
		}
	
		int avg= sum/number.length;
		
		System.out.println("The sum is: "+ sum);
		
		System.err.println("The avg is: "+ avg);
		
		int max= number[0];
		int min= number[0];
		
		for(int i=1; i<5; i++) {
			
			if(max < number[i]) {
				
				max= number[i];
				
			}
		
			if(min > number[i]) {
				
				min= number[i];
			}
		}
	
		System.out.println("Maximum = "+ max);
		
		System.out.println("Minimum = "+ min);
	
	}
}
