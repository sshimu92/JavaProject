package InterfaceDemo;

public class Loan implements Home, Car, Education{

	@Override
	public void eduLoan() {
		
		System.out.println("Rate of interest on education loan is 7.5%");
		
	}

	@Override
	public void homeLoan() {
		
		System.out.println("Rate of interest on home loan is 9.5%");
		
	}

	@Override
	public void carLoan() {
		
		System.out.println("Rate of interest on car loan is 8.5%");
		
	}

}
