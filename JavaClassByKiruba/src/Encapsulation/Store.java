package Encapsulation;

public class Store {

	private Book currentBook;

	public void setBook(Book book) {

		this.currentBook = book;
	}

	public void getInventoryDetails() {

		if (currentBook != null) {

			System.out.println("Book title: " + currentBook.getTitle());

			System.out.println("Book author: " + currentBook.getAuthor());

			System.out.println("Book ISBN: " + currentBook.getISBN());

			System.out.println("Book quantity: " + currentBook.getQuantity());

			System.out.println("Book price: " + currentBook.getPrice());

		} else {

			System.out.println("Book not found");
		}

	}

	public void updateQuantity(int newQuantity) {

		if (currentBook != null) {

			currentBook.setQuantity(newQuantity);

			System.out.println("Quantity updated to: " + newQuantity);
			System.out.println("Total value recalculted to: " + currentBook.calculateTotalValue());

		} else {

			System.out.println("No book set found");
		}
	}

	public void sellBook(int quantity) {

		if (currentBook != null) {

			if (quantity <= currentBook.getQuantity()) {

				currentBook.setQuantity(currentBook.getQuantity() - quantity);

				System.out.println("Sold: " + quantity + " copies of the book.");
				System.out.println("Quantity updated to: " + currentBook.getQuantity());
				System.out.println("Total Value recalculated to: " + currentBook.calculateTotalValue());

			} else {

				System.out.println("Not enough quantity to sell.");
			}

		} else {

			System.out.println("No book set. Please set a book using setBook() method.");
		}

	}	
}
	

	
	

			
	

