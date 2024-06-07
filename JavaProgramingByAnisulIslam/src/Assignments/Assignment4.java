package Assignments;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int phonePrice= 1800;
		int numberOfInstallment, installmentPerMonth;
		
		System.out.println("Number of installment? ");
		
		int num= sc.nextInt();
		
	    installmentPerMonth=(phonePrice/num);
		
		
		System.out.println("Monthly installment amount: "+ installmentPerMonth +" "+ "Dollar");
		
		
		

	}

}
