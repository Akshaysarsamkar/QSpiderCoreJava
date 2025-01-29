package StarPattern;

public class LeftHalfInvertPattern {

	public static void main(String[] args) {


		for (int i = 5; i >= 1; i--) {

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
