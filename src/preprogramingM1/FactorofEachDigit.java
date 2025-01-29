package preprogramingM1;

import java.util.Scanner;

public class FactorofEachDigit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();

		while (num > 0) {
			int rem = num % 10;
			System.out.print("Factor of " + rem + " : ");
			for (int i = 1; i <= rem; i++) {
				if (rem % i == 0) {
					System.out.print(i + " ");
				}
			}
			num = num / 10;
			System.out.println();
		}
	}

}
