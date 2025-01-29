package classobject;

import java.util.Scanner;

public class HotelDriver {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Hotel name: ");
		String hotelName = scanner.nextLine();

		System.out.println("Enter the owner name: ");
		String ownerName = scanner.nextLine();

		System.out.println("Enter the Hotel Type: ");
		String hotelType = scanner.nextLine();

		System.out.println("Enter total Employees in hotel : ");
		int hotelTotalNumberOfEmployees = scanner.nextInt();

		Hotel hotel = new Hotel(hotelName, ownerName, hotelType, hotelTotalNumberOfEmployees);
		hotel.hotelDetails();

	}

}
