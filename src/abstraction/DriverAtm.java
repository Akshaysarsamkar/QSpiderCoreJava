package abstraction;

import java.util.Scanner;

public class DriverAtm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean exit = true;
		IciciAtm atm = new IciciAtm();

		while (exit) {
			System.out.println();
			System.out.println(
					"Choice the option \n1]Create Account \n2]Deactivate Account \n3]Withdraw \n4]deposite \n5]BalanceEnquiry \n6]changePassword \n7]exit ");
			int ch = scanner.nextInt();

			switch (ch) {

			case 1: {

				Account account = new Account(9685421030l, 123, 5000f);
				atm.createAccount(account);
			}
				break;

			case 2: {
				System.out.println("Enter the Passowrd");
				int password = scanner.nextInt();
				atm.deactivateAccount(password);
			}
				break;

			case 3: {
				System.out.println("Enter the Passowrd");
				int password = scanner.nextInt();

				System.out.println("Enter the Amount");
				float amount = scanner.nextFloat();

				atm.withdraw(password, amount);
			}
				break;

			case 4: {
				System.out.println("Enter the Passowrd");
				int password = scanner.nextInt();

				System.out.println("Enter the Amount");
				float amount = scanner.nextFloat();

				atm.deposite(password, amount);
			}
				break;

			case 5: {
				System.out.println("Enter the Passowrd");
				int password = scanner.nextInt();
				atm.balanceEnquiry(password);
			}
				break;

			case 6: {

				System.out.println("Enter the Old Passowrd");
				int oldPassword = scanner.nextInt();

				System.out.println("Enter the New Passowrd");
				int newPassword = scanner.nextInt();

				atm.changePassword(oldPassword, newPassword);

			}
				break;

			case 7: {
				exit = false;
				System.out.println("Thank You");
			}
				break;

			default: {
				System.out.println("Invalid choice");
			}

			}

		}
	}

}
