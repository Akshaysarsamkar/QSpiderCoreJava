package preprogramingM1.pattern;

public class Upperpyramid {

	public static void main(String[] args) {

		int num = 4;

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

	}

}
