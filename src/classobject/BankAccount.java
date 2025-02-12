package classobject;

//Implement a BankAccount class that supports deposit, withdraw, and check_balance methods. 
//Ensure that the account balance cannot go negative.


public class BankAccount {
	
	long accountNumber;
	int balance;
	
	
	
	public BankAccount(long accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}


	public void deposit(int amount) {
		
		System.out.println("Your successfully deposit "+ amount + " RS");
		System.out.println("total amount is " + (balance+amount));
		
	}
	
	
	public void withdraw(int amount) {
		System.out.println("Your successfully Withdraw  "+ amount + "RS");
		System.out.println("total amount is Account is " + (balance-amount));
	}
	
	public void checkBalance() {
		System.out.println("Your balance is : " + balance);
	}
	
	

	public static void main(String[] args) {
		
		BankAccount account = new BankAccount(895632104, 5000);
		
		account.deposit(650);
		
		account.withdraw(4520);
		
		account.checkBalance();

	}

}
