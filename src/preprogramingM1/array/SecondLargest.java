package preprogramingM1.array;

public class SecondLargest {

	public static void main(String[] args) {

		int a[] = { 12, 32, 45, 89, 74, 65,98 };

		int firstLargeNumber = a[0];

		for (int i = 1; i < a.length; i++) {
			if (firstLargeNumber < a[i]) {
				firstLargeNumber = a[i];
			}
		}

		System.out.println("First Largest Number is: " + firstLargeNumber);

		int secondLargeNumber = Integer.MIN_VALUE;

		for (int i = 1; i < a.length; i++) {
			if (secondLargeNumber < a[i] && firstLargeNumber > a[i]) {
				secondLargeNumber = a[i];
			}
		}

		System.out.println("second Largest Number is: " + secondLargeNumber);

	}

}
