package LoopingStatement.whileloop;

import java.util.Scanner;

public class ExecuteUntileNagativeNUmber {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a = 45;
		
		while (a > 0) {
			System.out.println("Not Negative.......");
			System.out.println("Enter number");
			a = scanner.nextInt();
		}

	}

}
