package Two_D_Array;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the No Of Rows:=");
		int rows = sc.nextInt();

		System.out.println("Enter the No Of Column:=");
		int cols = sc.nextInt();

		int a[][] = new int[rows][cols];

		System.out.println("Enter the Array Element");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("Odd Number in 2-D Array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] % 2 != 0)
					System.out.print(a[i][j] + " ");
			}
		}

		System.out.println();
		System.out.println("Even Number in 2-D Array");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (a[i][j] % 2 == 0)
					System.out.print(a[i][j] + " ");
			}
		}
	}

}
