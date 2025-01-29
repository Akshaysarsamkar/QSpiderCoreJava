package preprogramingM1;

import java.util.Scanner;

public class HappyOrSadNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();


		while (true) {
			int sum = 0;

			while (num !=  0) {
				int rem = num % 10;
				int s = rem * rem;
				sum = sum + s;
				num = num / 10;
			}

			if (sum == 1) {
				System.out.println("Happy number");
				break;
			} else if (sum == 4) {
				System.out.println("Number is sad number");
				break;
			}

			num = sum;
		}

	}

}
