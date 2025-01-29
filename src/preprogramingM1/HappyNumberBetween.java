package preprogramingM1;

public class HappyNumberBetween {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			while (true) {
				int sum = 0;
				int num = i;
				while (num != 0) {

					int rem = num % 10;
					int s = rem * rem;
					sum = sum + s;
					num = num / 10;
				}

				if (sum == 1) {
					System.out.println(i + " is Happy Number");
					break;
				}
				num = sum;
			}

		}

	}

}
