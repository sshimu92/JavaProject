package Inheritance;

public class NRIAccount extends BankAccount{

	
     public void applyFixedDeposit() {
		
    	 super.interestRate= 6.5;
    	 
    	 System.out.println("Interest Rate is: "+ interestRate);
		
	}
}
