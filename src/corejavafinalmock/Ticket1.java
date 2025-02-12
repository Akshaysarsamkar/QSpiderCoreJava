package corejavafinalmock;

public class Ticket1 implements Comparable {

	String destination;
	String boarding;
	String date;
	long ticketNo;
	double price;
	long noOfKm;
	Bus bus;

	public Ticket1(String destination, String boarding, String date, long ticketNo, double price, long noOfKm,
			Bus bus) {
		super();
		this.destination = destination;
		this.boarding = boarding;
		this.date = date;
		this.ticketNo = ticketNo;
		this.price = price;
		this.noOfKm = noOfKm;
		this.bus = bus;
	}

	@Override
	public int compareTo(Object o) {
		Ticket1 ticket1 = (Ticket1) o;

		if (this.ticketNo > ticket1.ticketNo) {
			return 1;
		} else if (this.ticketNo < ticket1.ticketNo) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "Ticket1 [destination=" + destination + ", boarding=" + boarding + ", date=" + date + ", ticketNo="
				+ ticketNo + ", price=" + price + ", noOfKm=" + noOfKm + ", bus=" + bus.getTravelName() + "]";
	}

}
