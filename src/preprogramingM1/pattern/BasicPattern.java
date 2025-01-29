package preprogramingM1.pattern;

import java.util.Iterator;

public class BasicPattern {

	public static void main(String[] args) {

		int num = 5;
		System.out.println("================== Left Arrow ============================");

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= 5; j++) {

				if (i == 1 || j == 1 || i == j) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

		System.out.println("================== Right Arrow  ============================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == 1 || j == num || i + j == num + 1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

		System.out.println("================== Down Arrow  ============================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i == num || j == num || i == j)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

		System.out.println("================== X-Shape ============================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i + j == num + 1 || i == j)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

		System.out.println("================== Trangle Shape ============================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j == 1 || i == num || i == j)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

		System.out.println("================== N-Invers Shape ============================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j == 1 || i + j == num + 1 || j == num)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

		System.out.println("================== Box ============================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i + j == num + 1 || i == j || i == 1 || j == 1 || i == num || j == num)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}
