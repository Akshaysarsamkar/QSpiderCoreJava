package controlstatement;

public class SwitchStatementExample {

	public static void main(String[] args) {

		int a = 21;
		int b = 45;

		System.out.println("Choice the options");
		System.out.println("1] Addition");
		System.out.println("2] subtraction");
		System.out.println("3] Multipication");
		System.out.println("4] Division");
		System.out.println("5] Modular");

		int res = 3;

		switch (res) {

		case 1: {
			System.out.println("Addition is : " + (a + b));
		}
			break;
		case 2: {
			System.out.println("Subtraction is : " + (a - b));
		}
			break;

		case 3: {
			System.out.println("Multipication is : " + (a * b));

		}
			break;

		case 4: {
			System.out.println("division is :" + (a / b));
		}
			break;

		case 5: {
			System.out.println("modular is : " + (a % b));
		}
			break;

		default: {
			System.out.println("choice correct option............");
		}
			break;

		}
	}
}
