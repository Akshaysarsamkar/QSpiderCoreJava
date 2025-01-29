package preprogramingM1.array;

public class HighestSumOfTwoElement {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 8, 7, 9,9 };

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (sum < a[i] + a[j])
					sum = a[i] + a[j];
			}
		}

		System.out.println("Hight sum of two element is: " + sum);

	}

}
