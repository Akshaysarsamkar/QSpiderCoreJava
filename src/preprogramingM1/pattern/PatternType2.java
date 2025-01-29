package preprogramingM1.pattern;

import java.util.Iterator;

public class PatternType2 {

	public static void main(String[] args) {

		int num = 5;

		System.out.println(
				"=====================================  Left Upper Trangle =========================================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j <= i)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println(
				"=====================================  Right Upper Trangle =========================================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j + i >= num + 1)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println(
				"=====================================  Left Down Trangle =========================================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (i + j <= num + 1)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println(
				"=====================================  Right Down Trangle =========================================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j >= i)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println(
				"=====================================  (Left Down Trangle) + (Right Down Trangle) =========================================");
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {
				if (i + j <= num + 1 || j - i >= num - 1)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println(
				"=====================================  (Right Upper Trangle) + (Left Upper Trangle) =========================================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {
				if (i + j >= num * 2 || i >= j)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println(
				"=====================================  (Left Down Trangle) + (Left Upper Trangle) =========================================");
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num; j++) {
				if (i + j <= num + 1 || i - j >= num)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println(
				"=====================================  (Rigth Down Trangle) + (Rigth Upper Trangle) =========================================");
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num; j++) {
				if (j >= i || i + j >= num * 2)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println(
				"=====================================  (Rigth Down Trangle) + (Rigth Upper Trangle) + (Left Down Trangle) + (Left Upper Trangle)  =========================================");
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {
				if (i + j <= num+1
						
						|| i - j >= num - 1 || j - i >= num - 1 || i + j >= num * 2 + 1)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

	}

}
