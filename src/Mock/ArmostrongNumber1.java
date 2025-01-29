package Mock;

public class ArmostrongNumber1 {

	public static void main(String[] args) {

		for (int num = 1; num <= 1000; num++) {

			int temp = num;

			int count = 0;

			while (temp > 0) {
				int rem = temp % 10;
				count++;
				temp = temp / 10;
			}

			temp = num;
			int totaldigitsum = 0;
			while (temp > 0) {
				int rem = temp % 10;
				int digitsum = 1;
				for (int i = 0; i < count; i++) {
					digitsum = digitsum * rem;
				}
				totaldigitsum = totaldigitsum + digitsum;
				temp = temp / 10;
			}

			if (totaldigitsum == num) {
				System.out.println(num);
			}

		}
	}

}
