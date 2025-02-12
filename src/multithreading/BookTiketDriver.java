package multithreading;

public class BookTiketDriver {

	public static void main(String[] args) {

		BookShow bookShow = new BookShow();

		Person1 person1 = new Person1(bookShow);
		person1.start();

		Person2 person2 = new Person2(bookShow);
		person2.start();
	}

}
