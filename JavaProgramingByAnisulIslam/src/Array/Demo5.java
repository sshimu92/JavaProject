package Array;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] A = new int[2][3];
		int[][] B = new int[2][3];

		System.out.println("Please enter elements for A matrix: ");

		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.printf("A[%d][%d] = ",row,col);
				
				A[row][col] = sc.nextInt();

			}
		}

		System.out.println("Please enter elements for A matrix: ");
		
		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.printf("B[%d][%d] = ",row,col);
				
				B[row][col] = sc.nextInt();

			}
		}

		System.out.println("\n\n");
		
		System.out.print("A = ");

		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print("\t " + A[row][col]);
			}

			System.out.println();
		}

		System.out.println("\n\n");
		
		System.out.print("B = ");

		for (int row = 0; row < 2; row++) {

			for (int col = 0; col < 3; col++) {

				System.out.print("\t " + B[row][col]);
			}

			System.out.println();
		}
	
		//Add A and B Matrix
		System.out.println("\n\n");
		
		System.out.print("A+B = ");
		
		for(int row=0; row<2; row++) {
			
			for(int col=0; col<3; col++) {
				
				System.out.print(" \t "+ (A[row][col] + B[row][col]));;
			}
		
			System.out.println();
		}
	}
}
