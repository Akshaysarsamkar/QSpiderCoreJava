package preprogramingM1;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Number:=");
		boolean flag = false;
		int num = scanner.nextInt();

		int squere = num * num;

		while (squere > 0) {
			int rem = squere % 10;
            num = num % 10;
			if (rem == num) {
				flag = true;
				break;
			}

			squere = squere / 10;
			num = num /10;
		}

		if (flag) {
			System.out.println("number is automorphic number");
		}else {
			System.out.println("Number is not automorphic number");
		}
	}

}
