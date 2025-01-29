package preprogramingM1;

import java.util.Scanner;

public class Count_Digti {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number.....");
		int num = scanner.nextInt();
		int c = 0;
		while (num > 0) {

			num = num / 10;
			c++;

		}
		System.out.println("Total digit in given number is: " + c);
	}

}
