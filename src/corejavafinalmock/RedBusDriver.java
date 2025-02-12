package corejavafinalmock;

import java.util.Scanner;

public class RedBusDriver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		RedBus redBus = new RedBus();

		while (true) {
			System.out.println("\n===== RedBus Booking System =====");
			System.out.println("1. Book Ticket");
			System.out.println("2. Make Payment");
			System.out.println("3. Cancel Ticket");
			System.out.println("4. View Ticket Details");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline

			switch (choice) {
			case 1: // Book Ticket
				System.out.print("Enter Destination: ");
				String destination = scanner.nextLine();

				System.out.print("Enter Boarding Point: ");
				String boarding = scanner.nextLine();

				System.out.print("Enter Travel Date (YYYY-MM-DD): ");
				String date = scanner.nextLine();

				System.out.print("Enter Travel Agency (Lalita / Lata / Mala): ");
				String travelAgency = scanner.nextLine();

				System.out.print("Enter Ticket Number: ");
				long ticketNo = scanner.nextLong();

				System.out.print("Enter Ticket Price: ");
				double price = scanner.nextDouble();

				System.out.print("Enter Distance (KM): ");
				long noOfKm = scanner.nextLong();

				Bus selectedBus = redBus.selectTravel(travelAgency);
				Ticket ticket = new Ticket(destination, boarding, date, ticketNo, price, noOfKm, selectedBus);
				redBus.bookTicket(ticket);
				break;

			case 2: // Make Payment
				System.out.print("Enter Ticket Number: ");
				long payTicketNo = scanner.nextLong();

				Ticket payTicket = redBus.ticketMap.get(payTicketNo);
				if (payTicket != null) {
					redBus.payment(payTicket.price);
				} else {
					System.out.println("Ticket not found!");
				}
				break;

			case 3: // Cancel Ticket
				System.out.print("Enter Ticket Number to Cancel: ");
				long cancelTicketNo = scanner.nextLong();
				redBus.cancelTicket(cancelTicketNo);
				break;

			case 4: // View Ticket Details
				System.out.print("Enter Ticket Number: ");
				long viewTicketNo = scanner.nextLong();
				redBus.ticketDetails(viewTicketNo);
				break;

			case 5: // Exit
				System.out.println("Exiting... Thank you for using RedBus!");
				scanner.close();
				return;

			default:
				System.out.println("Invalid choice! Please enter a valid option.");
			}
		}
	}
}
