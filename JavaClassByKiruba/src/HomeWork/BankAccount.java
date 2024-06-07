package HomeWork;

public class BankAccount { //Class Name
   
	//Attributes
	String accountHolderName;
	int accountNumber;
	double accountBalance;

	//Constructor
	public BankAccount(String name, int number, double balance) {

		accountHolderName = name;
		accountNumber = number;
		accountBalance = balance;

	}
     //Static Method.
	public static BankAccount createAccount(String name, int number, double balance) {

		BankAccount b = new BankAccount(name, number, balance);
		return b;

	}
	//Static Method.
	public static void deposit(BankAccount account, double amount) {
		// update the account balance by adding the deposit amount
		account.accountBalance = account.accountBalance + amount;

		System.out.println("Deposited: " + amount + " " + "successfully");

	}
	//Static Method.
	public static void withdraw(BankAccount account, double amount) {
		// check if there are sufficient funds for withdraw

		if (amount <= account.accountBalance) {

			System.out.println("Withdrawn: " + amount + " " + "successfully!!!!");
		
		} else {
			
			System.out.println("Insufficient funds....");
		}

	}
	//Static Method.
	public static void display(BankAccount account) {

		System.out.println("Account Holder Name: " + account.accountHolderName);

		System.out.println("Account Number: " + account.accountNumber);

		System.out.println("Account Balance: " + account.accountBalance);

	}
    //Main Method.
	public static void main(String[] args) {

		// BankAccount myAccount= new BankAccount("Mike", 123456789, 1000.00);

		BankAccount myAccount = BankAccount.createAccount("Mike", 123456789, 1000.00);
		BankAccount.deposit(myAccount, 500);
		BankAccount.withdraw(myAccount, 200.00);
		BankAccount.display(myAccount);

	}
}
