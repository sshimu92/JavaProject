package HomeWork;

public class Book {

	String title;
	String author;
	String ISBN;
	int quantity;

	public Book(String title, String author, String ISBN, int quantity) {

		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.quantity = quantity;

	}

	public static Book createBook(String title, String author, String ISBN, int quantity) {

		return new Book(title, author, ISBN, quantity);

	}

	public static void borrowBook(Book book, int copiesToBorrow) {

		if (book.quantity >= copiesToBorrow) {

			book.quantity = book.quantity - copiesToBorrow;

			System.out.println("Borrowed: " + copiesToBorrow + " copies ");
		}
		else {

			System.out.println("Copies are not available....");
		}
	}

	public static void returnBook(Book book, int copiesToReturn) {

		book.quantity += copiesToReturn;

		System.out.println("Returned: " + copiesToReturn + " copies ");

	}

	public static void display(Book book) {

		System.out.println("Book Name: " + book.title);
		System.out.println("Author Name: " + book.author);
		System.out.println("ISBN Number: " + book.ISBN);
		System.out.println("Number of copies available: " + book.quantity);

	}

	public static void main(String[] args) {

		Book myBook = Book.createBook("Fairy Tale", "Stephen King", "97895204", 10);

		Book.borrowBook(myBook, 5);
		Book.returnBook(myBook, 2);
		Book.display(myBook);

	}

}

