package preprogramingM1;

import java.util.Scanner;

public class SumOfOddDigit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number.....");
		int num = scanner.nextInt();
		int sum = 0;
		while (num > 0) {
			
			int rem = num % 10;
			
			if(rem % 2 != 0)
			     sum = sum + rem;
			
			num = num / 10;
		}
		System.out.println("Total digit in given number is: " + sum);

	}

}
