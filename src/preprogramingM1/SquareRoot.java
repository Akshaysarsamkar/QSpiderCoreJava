package preprogramingM1;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the numbdr ");
		int num = scanner.nextInt();

		for (int i = 1; i < num / 2; i++) {
			if ((i * i) == num) {
				System.out.println("Square root is : " + i);
				break;
			} else if (i * i > num) {
				System.out.println("square is in decimal format");
				break;
			}
		}
	}

}
