package preprogramingM1;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = sc.nextInt();

		int rev = 0;
        int num1 = num;
		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		System.out.println("Reverse number of " + num1 + " is " + rev);

	}

}
