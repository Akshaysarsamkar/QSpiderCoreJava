package preprogramingM1;

public class PrimeNumberBetweenNumbers {

	public static void main(String[] args) {

		System.out.println("Prime number between 1 to 100");
		for (int i = 1; i <= 100; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				System.out.println(i);
			}
		}

	}

}
