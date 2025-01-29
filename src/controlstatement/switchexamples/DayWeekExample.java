package controlstatement.switchexamples;

public class DayWeekExample {

	public static void main(String[] args) {

		System.out.println("Choice One");
		System.out.println("1] Monday");
		System.out.println("2] Tuesday");
		System.out.println("3] wednesday");
		System.out.println("4] thursday");
		System.out.println("5]friday");
		System.out.println("6] saturday");
		System.out.println("7] Sunday");

		int ch = 6;

		switch (ch) {

		case 1: {
			System.out.println("today is Monday");
		}
			break;

		case 2: {
			System.out.println("today is Tuesday");
		}
			break;
		case 3: {
			System.out.println("today is wednesday");
		}
			break;
		case 4: {
			System.out.println("today is thursday");
		}
			break;
		case 5: {
			System.out.println("today is friday");
		}
			break;
		case 6: {
			System.out.println("today is saturday");
		}
			break;

		case 7: {
			System.out.println("today is Sunday");
		}
			break;

		default:
			System.out.println("Invalid input !!");
			break;
		}
	}

}
