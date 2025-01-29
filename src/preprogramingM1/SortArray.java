package preprogramingM1;

public class SortArray {

	public static void main(String[] args) {

		int a[] = { 4, 8, 9, 6, 3, 1, 4, 7, 5 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;

				}

			}

		}
		for (int n : a) {
			System.out.print(n + " ");
		}

	}

}
