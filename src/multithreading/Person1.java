package multithreading;

public class Person1 extends Thread {

	BookShow bookShow = new BookShow();

	public Person1(BookShow bookShow) {
		this.bookShow = bookShow;
	}

	

	@Override
	public void run() {
		bookShow.bookSeat(6);
	}

}
