package opps.inheritance;

import java.util.Scanner;

public class MobileEarphoneDriver {

	public static void main(String[] args) {

		Mobile mobile = new Mobile("POCO_M2_PRO", "MI", 12500);

		Scanner scanner = new Scanner(System.in);

		boolean exit = true;

		while (exit) {
			System.out.println(
					"Enter Your Choice:\n1]InserEarphone \n2]RemoveEarphone \n3]MobileAndEarPhoneDetails \n4]Exit");

			int ch = scanner.nextInt();

			switch (ch) {
			case 1: {
				mobile.insertEarPhone(new EarPhone("Boot", "Black", 2500));
			}
				break;
			case 2: {
				mobile.removeEarphone();
			}
				break;
			case 3: {
				mobile.earPhoneAndMobileDetails();
			}
				break;
			case 4: {
				exit = false;
			}
				break;
			default:

				System.out.println("Invalid Input.....");
			}

		}

	}

}
