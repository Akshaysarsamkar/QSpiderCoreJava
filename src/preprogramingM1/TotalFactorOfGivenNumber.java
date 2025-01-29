package preprogramingM1;

import java.util.Scanner;

public class TotalFactorOfGivenNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number : ");
		int num = scanner.nextInt();

		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}

		System.out.println("Total Factor of the " + num + " is " + count);

	}

}
