package Inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		NRIAccount n= new NRIAccount();
		
		n.depositMoney();
		n.withdrawMoney();
		n.applyFixedDeposit();
		
		System.out.println("*********************");
		
		SeniorCitizen s= new SeniorCitizen();
		
		s.depositMoney();
		s.withdrawMoney();
		s.applyFixedDeposit();
		
		
		
		
		
		
		
		
		
		
		

	}

}
