package preprogramingM1;

public class SpyNumber1 {

	public static void main(String[] args) {

		System.out.println("Spy number between 100 to 1000");
		for (int i = 100; i <= 1000; i++) {
			
			int sum = 0;
			int product = 1;
			int num = i;
			
			while (i > 0) {
				int rem = i % 10;
				sum = sum + rem;
				product = product * rem;
				i = i / 10;
			}
			if (sum == product) {
				System.out.println(num);
			}

		}

	}

}
