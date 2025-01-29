package StarPattern;

public class LeftHalfPriyamid {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {

			// print space
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}

			// print star
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
