package controlstatement.switchexamples;

public class Month {

	public static void main(String[] args) {

		System.out.println("Choice any one........");

		System.out.println("1] Jan");
		System.out.println("2] Feb");
		System.out.println("3] Mar");
		System.out.println("4] Apr");
		System.out.println("5] May");
		System.out.println("6] Jun");
		System.out.println("7] July");
		System.out.println("8] Aug");
		System.out.println("9] Sep");
		System.out.println("10] Oct");
		System.out.println("11] Nov");
		System.out.println("12] Dec");

		int ch = 4;

		switch (ch) {

		case 1: {
			System.out.println("Month is Jan");
		}
			break;

		case 2: {
			System.out.println("Month is Feb");
		}
			break;

		case 3: {
			System.out.println("Month is Mar");
		}
			break;

		case 4: {
			System.out.println("Month is Apr");
		}
			break;

		case 5: {
			System.out.println("Month is May");
		}
			break;

		case 6: {
			System.out.println("Month is Jun");
		}
			break;

		case 7: {
			System.out.println("Month is July");
		}
			break;

		case 8: {
			System.out.println("Month is Aug");
		}
			break;

		case 9: {
			System.out.println("Month is Sep");
		}
			break;

		case 10: {
			System.out.println("Month is Oct");
		}
			break;

		case 11: {
			System.out.println("Month is Nov");
		}
			break;

		case 12: {
			System.out.println("Month is Dec");
		}
			break;

		default:
			System.out.println("invalid input!!");
			break;

		}

	}

}
