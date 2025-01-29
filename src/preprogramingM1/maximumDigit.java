package preprogramingM1;

import java.util.Scanner;

public class maximumDigit {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the number");
		int num = scanner.nextInt();
		
		int max = Integer.MIN_VALUE;
		
		while(num != 0)
		{
			int rem = num % 10;
			
			if (rem > max) {
				max = rem;
			}
			num = num /10;
		}
		
		System.out.println("Maximum number is " + max);
	}

}
