package preprogramingM1;

import java.util.Scanner;

public class NeanNumber {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		System.out.println("Enter the number:=");
		for (int num = 1; num <= 50; num++) {
			int num1 = num;
			int square = 0, sum = 0;
			while (num > 0) {
				int rem = num % 10;
				square = square + rem;
				sum = sum + rem;
				num = num / 10;
			}

			if (sum == num1) {
				System.out.println(num1);
			} 
		}

	}

}
