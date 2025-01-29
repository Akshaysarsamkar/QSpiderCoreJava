package preprogramingM1;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		int base = 2;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();

		int pow = 1;

		for (int i = 1; i <= num; i++) {
			pow = pow * 2;
		}

		System.out.println("Power of " + num + " is " + pow);

	}

}
