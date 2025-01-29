package abstraction;

public class IciciAtm extends Atm
{
	Account a;//Achieved Has-A relationship

	//Aggregation -> late or lazy instantiation
	public void createAccount(Account a)
	{
		if(this.a==null)
		{
			this.a = a;
			System.out.println("Account has been successfully created");
		}
		else
		{
			System.out.println("Account already exists");
		}
	}
	
	
	
	public void deactivateAccount(int password)
	{
		if(this.a==null)
		{
			System.out.println("Account is not present to deactivate");
		}
		else
		{
			this.a = null;
			System.out.println("Account is deactivated successfully");
		}
	}



	@Override
	public void withdraw(int password, double amount)
	{
		if(this.a==null)
		{
			System.out.println("Account is not present to withdraw");
		}
		else
		{
			if(a.accountBalance >= amount)
			{
				if(a.accountPassword == password)
				{
					a.accountBalance = a.accountBalance - amount;
					System.out.println(amount+" has been withdrawn ");
					System.out.println(a.accountBalance+" is the available balance");
				}
				else
				{
					System.out.println("Incorrect password");
				}
			}
			else
			{
				System.out.println("Insufficient balance");
			}
		}
	}



	@Override
	public void deposite(int password, double amount) 
	{
		if(this.a==null)
		{
			System.out.println("Account is not present to deposite");
		}
		else
		{
				if(a.accountPassword == password)
				{
					a.accountBalance = a.accountBalance + amount;
					System.out.println(amount+" has been deposited ");
					System.out.println(a.accountBalance+" is the available balance");
				}
				else
				{
					System.out.println("Incorrect password");
				}
		
		}
		
	}



	@Override
	public void balanceEnquiry(int password) 
	{
		if(this.a==null)
		{
			System.out.println("Account is not present to check the balance");
		}
		else
		{
			if(a.accountPassword == password)
			{
				System.out.println(a.accountBalance+" is the available balance");
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
	}



	@Override
	public void changePassword(int oldPassword, int newPassword)
	{
		if(this.a==null)
		{
			System.out.println("Account is not present to change password");
		}
		else
		{
			if(a.accountPassword == oldPassword)
			{
				a.accountPassword = newPassword;
				System.out.println("Password has been successully changed");
			}
			else
			{
				System.out.println("Incorrect password");
			}
		}
		
	}
}