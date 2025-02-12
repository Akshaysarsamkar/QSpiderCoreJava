package Mock;

public class TustedPrimenumberMock {

	public static void main(String[] args) {

		for (int num = 1; num <= 1000; num++) {
			// int num = 71;
			int c = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					c++;
				}
			}

			if (c == 2) {
				
				int temp = num;
				int rev = 0;
				while (temp > 0) {
					int rem = temp % 10;
					rev = rev * 10 + rem;
					temp = temp / 10;
				}

				int c1 = 0;
				for (int i = 1; i <= rev; i++) {
					if (rev % i == 0) {
						c1++;
					}
				}

				if (c1 == 2) {
					System.out.println(num);
				}

			}

		}
	}
}
