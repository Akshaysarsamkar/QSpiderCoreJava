package preprogramingM1;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();
//		for (int num = 1; num <= 100; num++) {
			int n1 = num + 1;
			int sum = 0;
			for (int i = 1; i <= num; i++) {

				if (n1 % i == 0) {
					sum = sum + i;
				}

			}

			if (n1 == sum) {
				System.out.println(n1 + "Number is sunny number");
			} else {
				System.out.println("Number is not sunny Number");
			}
		//}

	}

}
