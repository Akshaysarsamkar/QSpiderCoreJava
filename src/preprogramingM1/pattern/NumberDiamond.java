package preprogramingM1.pattern;

public class NumberDiamond {

	public static void main(String[] args) {

		int num = 4;
		int n = 1;
		for (int i = 1; i <= num * 2 - 1; i++) {
			for (int j = 1; j <= num * 2 - 1; j++) {

				if (i + j >= num + 1 && j - i <= num - 1 && i - j <= num - 1 && i + j <= num * 3 - 1)
					System.out.print(n + " ");
				else
					System.out.print("  ");

			}
			System.out.println();
			n++;
		}

	}

}
