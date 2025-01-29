package opps.inheritance;

public class Author {

	String authorName;
	int age;
	String place;

	public Author(String authorName, int age, String place) {

		this.authorName = authorName;
		this.age = age;
		this.place = place;

	}

	public static void main(String[] args) {
		Book book = new Book(50, "BGT", "Dhone", 45, "Pune");
		book.showDetails();
	}

}
