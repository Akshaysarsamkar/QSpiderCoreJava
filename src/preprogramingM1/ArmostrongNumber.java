package preprogramingM1;

public class ArmostrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Armostrong number between 1 to 1000 is : ");

		for (int i = 1; i <= 1000; i++) {

			int num = i;
			int td = 0;

			while (num > 0) {
				int rem = num % 10;
				td++;
				num /= 10;
			}

			// System.out.println(td);

			num = i;
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				int power = 1;

				for (int j = 1; j <= td; j++) {
					power *= rem;
				}

				sum += power;
				num /= 10;

			}
			if (i == sum)
				System.out.println(i + " ");
		}

	}

}
