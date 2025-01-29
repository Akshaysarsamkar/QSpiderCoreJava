package preprogramingM1.pattern;

public class Pattern4 {

	public static void main(String[] args) {

		int num = 4;

		System.out.println("================================Upper prymid======================");
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i + j >= num + 1 && j - i <= num - 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================================  Down prymid==========================================");
		System.out.println();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i <= j && i + j <= num * 2)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================================  Left prymid==========================================");
		System.out.println();
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num; j++) {

				if (i >= j && i + j <= num * 2)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================================  Right prymid==========================================");
		System.out.println();
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num; j++) {

				if (i + j >= num + 1 && i - j <= num - 1)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================================  Square ==========================================");
		System.out.println();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i + j <= num * 2 && i + j >= num + 1)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================================  Diamond ==========================================");
		System.out.println();
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i + j >= num + 1 && j - i <= num - 1 && i - j <= num - 1 && i + j <= num * 3 - 1)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================================  Butterfly ==========================================");
		System.out.println();
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if ((i >= j && i + j <= num * 2) || (i + j >= num * 2 && j >= i))
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================================  Butterfly ==========================================");
		System.out.println();
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if ((j >= i && i + j <= num * 2) || (j <= i && i + j >= num * 2))
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();

		}

		System.out.println();
		System.out.println("================================  sastik ==========================================");
		System.out.println();
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i == num || j == num || (i == 1 && j >= num) || (i == num * 2 - 1 && j <= num)
						|| (j == 1 && i <= num) || (j == num * 2 - 1 && i >= num))
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();

		}

		System.out.println();
		System.out.println("================================  sastik ==========================================");
		System.out.println();
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i == num || j == num || (i == 1 && j <= num) || (i == num * 2 - 1 && j >= num)
						|| (j == 1 && i >= num) || (j == num * 2 - 1 && i <= num))
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();

		}

		System.out.println();
		System.out
				.println("================================  Hollow Diamond ==========================================");
		System.out.println();
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i + j == num + 1 || j - i == num - 1 || i - j == num - 1 || i + j == num * 3 - 1)
					System.out.print(" * ");
				else
					System.out.print("   ");

			}
			System.out.println();
		}

		System.out.println();
		System.out.println("================================  Diamond ==========================================");
		System.out.println();

		num = 0;
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i + j >= num + 1 && j - i <= num - 1 && i - j <= num - 1 && i + j <= num * 3 - 1)

					System.out.print(num + " ");
				else
					System.out.print("  ");

			}
			System.out.println();
			num++;
		}

		System.out.println();
		System.out.println("================================  Diamond ==========================================");
		System.out.println();

		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i + j >= num + 1 && j - i <= num - 1 && i - j <= num - 1 && i + j <= num * 3 - 1) {
					if ((i + j) % 2 == 0)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				} else
					System.out.print("  ");

			}
			System.out.println();

		}

	}
}
