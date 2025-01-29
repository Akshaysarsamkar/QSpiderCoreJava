package classobject;

public class Hotel {

	String hotelName;
	String ownerName;
	String hotelType;
	int hotelTotalNumberOfEmployees;

	public Hotel(String hotelName, String ownerName, String hotelType, int hotelTotalNumberOfEmployees) {
		super();
		this.hotelName = hotelName;
		this.ownerName = ownerName;
		this.hotelType = hotelType;
		this.hotelTotalNumberOfEmployees = hotelTotalNumberOfEmployees;
	}

	public void hotelDetails() {
		System.out.println();
		System.out.println("============= HOTEL DETAIL==============");
		System.out.println("Hotel Name : " + hotelName);
		System.out.println("Hotel OwnerName : " + ownerName);
		System.out.println("Total Employees : " + hotelTotalNumberOfEmployees);
		System.out.println("Hotel Type : " + hotelType);
	}

}
