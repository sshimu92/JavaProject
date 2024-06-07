package Encapsulation;

public class ClientProgram {

	public static void main(String[] args) {

		Book b = new Book("A Little Life", "Hanya Yanagihara", "9781529077216", 100, 14.99);

		Store s = new Store();
		s.setBook(b);
		s.getInventoryDetails();
		s.updateQuantity(50);
		s.sellBook(20);

	}

}
