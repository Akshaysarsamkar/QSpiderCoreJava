package preprogramingM1;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbe:");
		int num = sc.nextInt();

		int sum = 0;
		int pro = 1;

		while (num > 0) {
			
			int rem = num % 10;
			sum = sum + rem;
			pro = pro * rem;
			num = num / 10;

		}
		
		if(sum == pro) {
			System.out.println("Number is Spy number");
		}else {
			System.out.println("Number is not Spy number");
		}

	}

}
