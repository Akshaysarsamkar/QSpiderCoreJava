package preprogramingM1;

public class PefectNumberBetweenTwoNumber {

	public static void main(String[] args) {

		System.out.println("perfect number between 1 to 700 is :");

		for (int num = 1; num < 700; num++) {
			int sum = 0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum = sum + i;
				}
			}

			if (num == sum) {
				System.out.println(num);
			}
		}
	}
}
