package preprogramingM1.array;

public class SecondSmallestNumber {

	public static void main(String[] args) {

		int a[] = { 87, 56, 41, 20, 32, 65, 84,1,2 };

		int firstSmallNumber = a[0];

		for (int i = 1; i < a.length; i++) {

			if (firstSmallNumber > a[i]) {
				firstSmallNumber = a[i];
			}

		}

		System.out.println("First Smallerst Number is : " + firstSmallNumber);

		int secondSmallestNumber = Integer.MAX_VALUE;

		for (int i = 1; i < a.length; i++) {

			if (secondSmallestNumber > a[i] && a[i] != firstSmallNumber) {
				secondSmallestNumber = a[i];
			}

		}
		System.out.println("second Smallerst Number is : " + secondSmallestNumber);

	}

}
