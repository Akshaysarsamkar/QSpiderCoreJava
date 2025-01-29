package preprogramingM1;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int c = 1;
		for (int i = 2; i <= num; i++) {
			if (num % 2 == 0) {
				c++;
			}
		}

		if (c == 2) {
			System.out.println("Number is Prime number");
		} else {
			System.out.println("Number is not prime number");
		}
	}

}
