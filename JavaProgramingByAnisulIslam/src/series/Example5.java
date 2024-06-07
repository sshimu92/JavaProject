package series;

import java.util.Scanner;

public class Example5 {


	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		
		int n;
		int sum= 0;
		
		System.out.print("Enter the last number: ");
		
		n= sc.nextInt();
		
		for(int i=1 ; i<=n; i++) {
			
			System.out.print(i+"x"+i +" ");
			sum= sum + i;
		}
	
		System.out.println("="+" "+ sum);
	}
}
