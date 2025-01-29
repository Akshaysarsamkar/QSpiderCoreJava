package opps.inheritance;

public class Downcasting {

	public static void main(String[] args) {

		Child child = new Child("Kumar", 45, "Kumari", 98);

		Parent parent = child; // upcasting

		child = (Child) parent; // downcasting
		child.getDetails();

		System.out.println();
		child.getChildParentDetails();
	}

}
