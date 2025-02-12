package corejavafinalmock;

import java.util.TreeMap;

class RedBus {
	TreeMap<Long, Ticket> ticketMap = new TreeMap<>();

	// Book a ticket and store it in TreeMap
	public void bookTicket(Ticket ticket) {
		ticketMap.put(ticket.ticketNo, ticket);
		System.out.println("Ticket booked successfully! Ticket No: " + ticket.ticketNo);
	}

	// Select travel agency
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

	// Simulate payment process
	public boolean payment(double amount) {
		System.out.println("Processing payment of Rs. " + amount + "...");
		System.out.println("Payment successful!");
		return true;
	}

	// Cancel a ticket
	public void cancelTicket(long ticketNo) {
		if (ticketMap.containsKey(ticketNo)) {
			ticketMap.remove(ticketNo);
			System.out.println("Ticket No: " + ticketNo + " has been canceled.");
		} else {
			System.out.println("Invalid Ticket No! Ticket not found.");
		}
	}

	// Display ticket details
	public void ticketDetails(long ticketNo) {
		if (ticketMap.containsKey(ticketNo)) {
			System.out.println("Ticket Details: " + ticketMap.get(ticketNo));
		} else {
			System.out.println("No ticket found with Ticket No: " + ticketNo);
		}
	}
}