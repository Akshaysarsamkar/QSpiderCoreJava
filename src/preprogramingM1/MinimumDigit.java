package preprogramingM1;

import java.util.Scanner;

public class MinimumDigit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();

		int min = Integer.MAX_VALUE;

		while (num != 0) {
			int rem = num % 10;

			if (rem < min) {
				min = rem;
			}
			num = num / 10;
		}

		System.out.println("minimum number is " + min);

	}

}
