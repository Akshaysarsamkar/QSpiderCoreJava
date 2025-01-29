package LoopingStatement.whileloop;

import java.util.Scanner;

public class ProductOfNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int i = 1;
		int product = 1;
		while (i <= num) {
			product *= i;
			i++;
		}

		System.out.println("Product of all number between 1 to " + num + " is " + product);

	}

}
