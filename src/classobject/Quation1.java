package classobject;

// Question: Create a Book class with attributes title, author, isbn, and price. Write methods to display the book’s details and apply a discount to the price.

class Book {
	String title;
	String author;
	float price;
	int isbn;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, float price, int isbn) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.isbn = isbn;
	}

	public void addDiscount(Book[] b, int discountpercentage) {

		for (int i = 0; i < b.length; i++) {

			Float num = b[i].price;

			float discountDivided = num / 100;

			float totalDiscountAmount = discountDivided * discountpercentage;

			b[i].price = num - totalDiscountAmount;

		}
	}

	public void displayBook(Book[] b) {
		for (int i = 0; i < b.length; i++) {

			System.out.println("Book Title : " + b[i].title);
			System.out.println("Book Author : " + b[i].author);
			System.out.println("Book Price : " + b[i].price);
			System.out.println("Book Isbn : " + b[i].isbn);
			System.out.println();
		}
	}
}

public class Quation1 {

	public static void main(String[] args) {

		Book book[] = new Book[3];
		book[0] = new Book("Java", "sam", 852, 12);
		book[1] = new Book("Python", "ram", 415, 95);
		book[2] = new Book("PHP", "dano", 120, 2);

		Book b1 = new Book();
		System.out.println("Before Applied Discount ");
		b1.displayBook(book);

		b1.addDiscount(book, 16);

		System.out.println("After Applied Discount ");

		b1.displayBook(book);

	}

}
