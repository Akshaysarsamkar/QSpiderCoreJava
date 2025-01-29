package preprogramingM1.array;

public class ReverseEachElement {

	public static void main(String[] args) {

		int a[] = { 78, 65, 12, 48, 32, 65 };

		for (int i = 0; i < a.length; i++) {
			int rev = 0;
			while (a[i] != 0) {
				int rem = a[i] % 10;
				rev = rev * 10 + rem;
				a[i] = a[i] / 10;
			}

			System.out.println(rev);
		}

	}

}
