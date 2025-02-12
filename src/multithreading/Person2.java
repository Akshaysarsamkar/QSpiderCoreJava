package multithreading;

public class Person2 extends Thread {

	BookShow bookShow = new BookShow();

	public Person2(BookShow bookShow) {
		this.bookShow = bookShow;
	}

	@Override
	public void run() {
		bookShow.bookSeat(4);
	}

}
