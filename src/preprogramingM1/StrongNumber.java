package preprogramingM1;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		long num = sc.nextLong();
		long num1 = num;
		long sum = 0;
		while (num > 0) {

			long rem = num % 10;
			long fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}

			sum = sum + fact;
			num = num / 10;

		}
		if (sum == num1) {
			System.out.println("Strong number.........");
		} else {
			System.out.println("not strong number......");
		}
	}

}
