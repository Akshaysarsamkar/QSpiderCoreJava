package preprogramingM1;

public class StrongNumberBetween {

	public static void main(String[] args) {

		for (int num = 110; num <= 150; num++) {
			int sum = 0;
			int num1 = num;
			while (num > 0) {

				int rem = num % 10;
				int fact = 1;
				if (rem == 0) {
					sum = sum + 1;
				} else {
					for (int i = 1; i <= rem; i++) {
						fact = fact * i;
					}
				}
				sum = sum + fact;
				num = num / 10;
			}

			if (sum == num1) {
				System.out.println(num1);
			}
		}

	}

}
