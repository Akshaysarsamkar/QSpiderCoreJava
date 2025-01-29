package opps.encapsulation;

public class ICICICard {

	private int password = 1234;
	private double accountBalance = 5000;

	// getter method of check account balance
	public double getAccountBalance(int password) {

		// Varify and validate data
		if (this.password == password) {
			return accountBalance;
		} else {
			System.out.println("Enter valid password");
			return 0.0;
		}

	}

	// setter method for accountBalance
	public void setAccountBalance(double amount, int password) {

		if (this.password == password) {
			System.out.println("ceadit amount is " + amount);
			this.accountBalance = this.accountBalance + amount;
			System.out.println("Amount added total balance is " + this.accountBalance);
		} else {
			System.out.println("Enter the valid password!!");

		}

	}

}
