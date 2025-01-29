package preprogramingM1;

import java.util.Scanner;

public class ArmstorngNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();

		int temp = num;
		int count = 0;
		int sum = 0;
		for (int i = num; i > 0; i = i / 10) {
			count++;
		}
		System.out.println(count);

		while (num > 0) {
			int rem = num % 10;
			int pow = 1;
			for (int i = 1; i <= count; i++) {
				pow = pow * rem;
			}
			sum = sum + pow;

			num = num / 10;
		}

		if (sum == temp) {
			System.out.println("Number is Amrostorng number");
		} else {
			System.out.println("Number is not armostorng number");
		}

	}

}
