package controlstatement.switchexamples;

public class ConvertGreade {

	public static void main(String[] args) {

		System.out.println("Enter the Grade ");
		System.out.println("1] A");
		System.out.println("2] B");
		System.out.println("3] C");
		System.out.println("4] D");
		System.out.println("5] F");

		char ch = 'A';

		switch (ch) {

		case 1:
			System.out.println("Excellent");
			break;

		case 2:
			System.out.println("Good");
			break;

		case 3:
			System.out.println("Average");
			break;

		case 4:
			System.out.println("Poor");
			break;

		case 5:
			System.out.println("Fail");
			break;

		default:
			System.out.println("wrong input");

		}
	}

}
