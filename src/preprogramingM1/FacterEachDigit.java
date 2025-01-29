package preprogramingM1;

import java.util.Scanner;

public class FacterEachDigit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = scanner.nextInt();

		for (int i = num; num != 0; num = num / 10) {
			int rem = num % 10;
			System.out.println();
			System.out.print("Factor of " + rem + " := ");
			for (int j = 1; j <= rem; j++) {
				if (rem % j == 0) {
					System.out.print(j + " ");
				}
			}
		}
	}

}
