package Mock;

public class quation5 {

	public static void main(String[] args) {

		int a[][] = { { 45, 71, 171 }, { 101, 78, 41 }, { 21, 87, 56 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				int num = a[i][j];
				int num1 = num;
				int c = 0;
				for (int k = 1; k <= num; k++) {
					if (num % k == 0) {
						c++;
					}
				}

				if (c == 2) {
					int oc = 0;

					while (num > 0) {
						int rem = num % 10;
						oc++;
						num = num / 10;
					}

					System.out.println(num1 + " => " + oc);
				}

			}
		}
	}

}
