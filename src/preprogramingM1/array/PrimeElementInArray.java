package preprogramingM1.array;

public class PrimeElementInArray {

	public static void main(String[] args) {

		int a[] = { 78, 65, 12, 48, 32, 65, 7, 31 };

		for (int i = 0; i < a.length; i++) {

			int c = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {
					c++;
				}
			}

			if (c == 2) {
				System.out.println(a[i] + " is Prime Number");
			}
		}

	}

}
