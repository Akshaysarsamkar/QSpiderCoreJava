package opps.inheritance;

// Create a class Author.
// create three Non-static variables (authorName, age and place)
// Create a class Book make it as a child class for Author.
// Create two Non-static variables (name and price).
// Create a parameterized constructor and initialize (name, price and author).
// Create a main method.
// Create object for Book class.
// Print the values present in variables (name, price, authorName, age and place).

public class Book extends Author {

	int price;
	String name;

	public Book(int price, String name, String authorName, int age, String place) {
		super(authorName, age, place);
		this.price = price;
		this.name = name;
	}

	public void showDetails() {
		System.out.println("Book name is: " + this.name);
		System.out.println("Book Price is " + this.price);
		System.out.println("Author name is " + this.authorName);
		System.out.println("Author Age is: " + this.age);
		System.out.println("Author Place is " + this.place);
	}
}
