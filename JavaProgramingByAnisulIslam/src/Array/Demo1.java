package Array;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		double[] number= new double[5];
		double sum= 0;
		
		System.out.print("Please enter five numbers: ");
		
//		number[0]= sc.nextDouble();
//		number[1]= sc.nextDouble();
//		number[2]= sc.nextDouble();
//		number[3]= sc.nextDouble();
//		number[4]= sc.nextDouble();
//	    sum= number[0] + number[1] + number[2] + number[3] + number[4];
		
		for(int i=0; i<number.length; i++) {
			
			number[i]= sc.nextDouble();
		}
		
		for(int i=0; i<number.length; i++) {
			
			sum= sum + number[i]; //sum= 0+1= 1, 1+2=3, 3+3=6, 6+4= 10, 10+5= 15
		}
		
		System.out.println("The sum is: "+ sum);
		
		double avg= sum/number.length;
		System.out.println("The average is: "+ avg);
		
		
		

	}

}
