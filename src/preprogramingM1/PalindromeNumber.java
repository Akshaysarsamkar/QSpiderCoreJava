package preprogramingM1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = scanner.nextInt();
		int num1 = num;
		int rev = 0;
		for (int i = num; i > 0; i = i / 10) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		if (rev == num1) {
			System.out.println("Number is palindrome");

		} else {
			System.out.println("Number is not palindrome");
		}
	}

}
