package abstraction;

public class Account
{
	long accountNumber;
	int accountPassword;
	double accountBalance;
	
	public Account(long accountNumber, int accountPassword, double accountBalance) 
	{
		this.accountNumber = accountNumber;
		this.accountPassword = accountPassword;
		this.accountBalance = accountBalance;
	}
	
	public void accountDetails()
	{
		System.out.println("Account number : "+accountNumber);
		System.out.println("Account password : "+accountPassword);
		System.out.println("Account balance : "+accountBalance);
	}
	

}
