package corejavafinalmock;

import java.util.Scanner;
import java.util.TreeMap;

public class RedBus1 {

	TreeMap<Long, Ticket1> map = new TreeMap<Long, Ticket1>();
	Scanner scanner = new Scanner(System.in);
	Bus bus = new Bus("Lata");

	public void bookTicket(Ticket1 ticket) {
		map.put(ticket.ticketNo, ticket);
		System.out.println("Ticket Book Succesfully.............");
	}

	public void payment(double price) {
		System.out.println("Payment Succesfully done.........");
	}

	public Bus selectTravel(String travelName) {
		switch (travelName.toLowerCase()) {
		case "lalita":
			return new LalitaTravel();
		case "lata":
			return new LataTravel();
		case "mala":
			return new MalaTravel();
		default:
			System.out.println("Invalid travel selection. Defaulting to Lalita Travel.");
			return new LalitaTravel();
		}
	}

	public void ticketDetails(long ticketNo) {
		if (map.containsKey(ticketNo)) {
			System.out.println("Ticket Details: " + map.get(ticketNo));
		} else {
			System.out.println("No ticket found with Ticket No: " + ticketNo);
		}
	}

	public void cancleTicket(long ticketno) {

		if (map.containsKey(ticketno)) {
			map.remove(ticketno);
			System.out.println("Ticket cancle Succefully....");
		} else {
			System.out.println("Ticket not found..........");
		}

	}

}
