package LoopingStatement.whileloop;

import java.util.Scanner;

public class NumberIsPalindrome {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number: ");
		int num = scanner.nextInt();
		int rev = 0;
		int num1 = num;
		while (num > 0) {

			int rem = num % 10;

			rev = rev * 10 + rem;

			num /= 10;

		}
		
		if(num1 == rev)
			System.out.println("number is palindrome........");
		else {
			System.out.println("Number is not palindrome.......");
		}

	}

}
