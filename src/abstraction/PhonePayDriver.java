package abstraction;

import java.util.Scanner;

public class PhonePayDriver extends PhonePay {

	int password;
	float amount;

	public PhonePayDriver(int password, float amount) {
		super();
		this.password = password;

		this.amount = amount;
	}

	@Override
	public void sendMoney(long password, float amount, long number) {

		if (this.password == password) {

			if (this.amount > amount) {
				System.out.println(amount + " has been send to given " + number + " Sucessfully");
			} else {
				System.out.println("insuffecient balance...............");
			}
		} else {
			System.out.println("Enter correct Passowrd");
		}

	}

	@Override
	public void doRecharge(long password, float amount, long number) {
		if (this.password == password) {

			if (this.amount > amount) {
				System.out.println("done successfully");
			} else {
				System.err.println("insuffecient balance...............");
			}
		} else {
			System.err.println("Enter correct Passowrd");
		}

	}

	public static void main(String[] args) {

		PhonePayDriver phonePayDriver = new PhonePayDriver(123, 5000f);
		Scanner scanner = new Scanner(System.in);
		boolean exit = true;

		while (exit) {
			System.out.println("Choice the option \n1]Send Money \n2]Recharge \n3]Exits");
			int ch = scanner.nextInt();

			switch (ch) {
			case 1: {
				System.out.println("Enter the Password ");
				int password = scanner.nextInt();
				System.out.println("Enter the Amount");
				float amount = scanner.nextFloat();
				System.out.println("Enter the Number");
				long number = scanner.nextLong();
				phonePayDriver.sendMoney(password, amount, number);
			}
				break;

			case 2: {
				System.out.println("Enter the Password ");
				int password = scanner.nextInt();
				System.out.println("Enter the Amount");
				float amount = scanner.nextFloat();
				System.out.println("Enter the Number");
				long number = scanner.nextLong();
				phonePayDriver.doRecharge(password, amount, number);
			}
				break;

			case 3:
				exit = false;
				System.out.println("Thans for Use.........");
				break;

			default:
				System.out.println("Enter valid Input.......");

			}

		}

	}
}