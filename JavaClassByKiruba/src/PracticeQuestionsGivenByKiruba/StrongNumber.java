package PracticeQuestionsGivenByKiruba;

import java.util.Scanner;

import BasicsJava.FactorialNumber;

public class StrongNumber {

	
	public static void main(String[] args) {
		
		StrongNumber strongNumber= new StrongNumber();
		
		strongNumber.inputAcceptor();
		
	}
	
	public void inputAcceptor() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int input= sc.nextInt();	
        
	}
     public void inputValidator(int input) {
    	 
    	 if(input<0) {
    		 
    		 System.out.println("Give proper input not negative number");
    	
    	 }else if(input==0) {
    		 
    		 System.out.println("Give proper input not zero");
    	
    	 }else {
    		 
    		 boolean isStrong= checkStrongNumber(input);
    	     System.out.println("Is Strong Number: "+ isStrong);
    	 }
     }
	
     public boolean checkStrongNumber(int number) {
    	 
    	 int originalNumber= number;
    	 int sum= 0;
    	 
         while(number>0) {
        	 
        	 int digit= number % 10;
        	 sum += factorial(digit);
        	 number /= 10;
         }
           return sum== originalNumber;
     }

     private int factorial(int n) {
    	 return(n==0 || n==1) ? 1: n * factorial(n-1);
     }

     public void outputPrinter(String printStatement) {
    	 
    	 System.out.println(printStatement);
     }
}

