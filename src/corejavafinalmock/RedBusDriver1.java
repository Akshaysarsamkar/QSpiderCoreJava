package corejavafinalmock;

import java.util.Scanner;

public class RedBusDriver1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		RedBus1 bus = new RedBus1();
		boolean exit = true;

		while (exit) {
			System.out.println("\n===== RedBus Booking System =====");
			System.out.println("1. Book Ticket");
			System.out.println("2. Make Payment");
			System.out.println("3. Cancel Ticket");
			System.out.println("4. View Ticket Details");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int ch = scanner.nextInt();

			switch (ch) {
			case 1:
				System.out.print("Enter Destination: ");
				String destination = scanner.next();

				System.out.print("Enter Boarding Point: ");
				String boarding = scanner.next();

				System.out.print("Enter Travel Date (YYYY-MM-DD): ");
				String date = scanner.next();

				System.out.print("Enter Ticket Number: ");
				long ticketNo = scanner.nextLong();

				System.out.print("Enter Ticket Price: ");
				double price = scanner.nextDouble();

				System.out.print("Enter Distance (KM): ");
				long noOfKm = scanner.nextLong();

				System.out.print("Enter Travel Agency (Lalita / Lata / Mala): ");
				String travel = scanner.next();

				Bus selectedBus = bus.selectTravel(travel);

				Ticket1 ticket = new Ticket1(destination, boarding, date, ticketNo, price, noOfKm, selectedBus);

				bus.bookTicket(ticket);
				break;

			case 2:
				System.out.print("Enter Ticket Number: ");
				long tn = scanner.nextLong();
				Ticket1 ticket1 = bus.map.get(tn);
				if (ticket1 == null) {
					System.out.println("Wrong TicketNo Enter");
				} else {
					System.out.println(ticket1.price + " Pay succesfully..........");
				}
				break;

			case 3:
				System.out.print("Enter Ticket Number: ");
				long tn1 = scanner.nextLong();
				bus.cancleTicket(tn1);
				break;

			case 4:
				System.out.print("Enter Ticket Number: ");
				long tn3 = scanner.nextLong();
				bus.ticketDetails(tn3);
				break;

			case 5:
				exit = false;
				break;

			default:
				System.out.println("Invalid choic enter a valid option.");

			}

		}

	}

}
