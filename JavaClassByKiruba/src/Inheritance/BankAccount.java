package Inheritance;

public class BankAccount {

	double withdrawAmount= 500;
	double depositAmount= 1000;
	double interestRate= 9.5;
	double balance= depositAmount - withdrawAmount;;
	
	public void depositMoney() {
		
		System.out.println("Deposit Amount is:"+ depositAmount);
	}

	public void withdrawMoney() {
		
		System.out.println("Withdrawal Amount is:"+ withdrawAmount);
	}

	
}
