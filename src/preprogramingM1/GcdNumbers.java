package preprogramingM1;

import java.util.Scanner;

public class GcdNumbers {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int n1 = scanner.nextInt();

		System.out.println("Enter the number : ");
		int n2 = scanner.nextInt();

		System.out.println("all GCD number of " + n1 + " and " + n2);

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i  == 0 && n2 % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
