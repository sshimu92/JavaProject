package Inheritance;

public class SeniorCitizen extends BankAccount {

	
	public void applyFixedDeposit() {
		
		super.interestRate= 10.5;
		
		System.out.println("Interest Rate is: "+ interestRate);
	}
	
}
