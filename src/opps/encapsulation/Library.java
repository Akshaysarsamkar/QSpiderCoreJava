package opps.encapsulation;

import java.util.ArrayList;
import java.util.List;

/*
 *Create a class Library where the books attribute is private. 
 *Implement methods to add, remove, and view books, 
 *ensuring direct modification is not possible.
 */
public class Library {

	private ArrayList<Book> books = new ArrayList<>();

	

	public void addBook(Book b) {

		books.add(b);
		System.out.println("Book Added Succefully..............");

	}

	public void removeBook(int b) {

		if (books.contains(b)) {
			books.remove(b);
			System.out.println("Book remove Succefully..............");
		}

	}

	public void showBookDetails() {

		for (Book b : books) {
			System.out.println();
			System.out.println("Book ID " + b.getBookId());
			System.out.println("Book Name " + b.getBookName());
			System.out.println("Book Price " + b.getPrice());
		}

	}

}
