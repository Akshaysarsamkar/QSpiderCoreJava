package multithreading;

public class BookShow {

	public synchronized void bookSeat(int seat) {

		int totalSeat = 10;

		if (seat < totalSeat) {

			System.out.println("You Book " + seat);
			System.out.println("Remaining Seat is: " + (totalSeat - seat));

		} else {
			System.out.println("Seat Not Avaiable");
		}
	}

}
