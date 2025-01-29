package preprogramingM1;

import java.util.Scanner;

public class FactorialOfEachDigitInNuber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number");
		int num = scanner.nextInt();
		int fact = 1;
		while (num > 0) {

			int rem = num % 10;

			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of " + rem + " is " + fact);
			num = num / 10;
		}

	}

}
