package preprogramingM1.array;

public class TuistedNumber {

	public static void main(String[] args) {

		int a[] = { 37, 23, 13, 89, 13 };

		for (int i = 0; i < 100; i++) {
			int c = 0;
			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					c++;
				}

			}

			int res = 0;
			if (c == 2) {
				// System.out.print(a[i]);
				while (i != 0) {
					int rem = a[i] % 10;
					res = res * 10 + rem;
					i = i / 10;
				}
			}

			c = 0;
			for (int j = 1; j <= res; j++) {

				if (res % j == 0) {
					c++;
				}

			}

			if (c == 2) {
				System.out.println(" Number is turisted number");
			}

		}
	}

}
