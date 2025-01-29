package method;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number to check palindrome or not: ");
		
		int num = sc.nextInt();
		int n = num;
		int sum = 0;
		for(int i = num ; num != 0 ; num = num/10) {
			int rem = num % 10;
			sum = sum * 10 + rem;
		}
		
		if(sum == n) {
			System.out.println("number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}

	}

}
