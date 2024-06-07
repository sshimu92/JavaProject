package Encapsulation;

public class Book {

	private String title;
	private String author;
	private String ISBN;
	private int quantity;
	private double price;

	public Book(String title, String author, String ISBN, int quantity, double price) {

		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.quantity = quantity;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double calculateTotalValue() {
		return quantity * price;
    }
}
