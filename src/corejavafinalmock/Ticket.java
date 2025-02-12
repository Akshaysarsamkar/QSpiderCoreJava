package corejavafinalmock;

class Ticket implements Comparable<Ticket> {
	String destination;
	String boarding;
	String date;
	long ticketNo;
	double price;
	long noOfKm;
	Bus bus;

	public Ticket(String destination, String boarding, String date, long ticketNo, double price, long noOfKm, Bus bus) {
		this.destination = destination;
		this.boarding = boarding;
		this.date = date;
		this.ticketNo = ticketNo;
		this.price = price;
		this.noOfKm = noOfKm;
		this.bus = bus;
	}

	@Override
	public int compareTo(Ticket other) {
		return Long.compare(this.ticketNo, other.ticketNo);
	}

	@Override
	public String toString() {
		return "Ticket{" + "Destination='" + destination + '\'' + ", Boarding='" + boarding + '\'' + ", Date='" + date
				+ '\'' + ", Ticket No=" + ticketNo + ", Price=" + price + ", No of Km=" + noOfKm + ", Travel='"
				+ bus.getTravelName() + '\'' + '}';
	}
}
