package preprogramingM1;

import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number to find the factor");

		int num = scanner.nextInt();

		System.out.print("Factor of the " + num + " : ");

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
