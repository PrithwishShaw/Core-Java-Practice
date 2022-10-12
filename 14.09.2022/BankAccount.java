


class BankInfo
{
	private int accountNumber;
	double bankBalance;
}

void bankDetails(int accountNumber, double bankBalance)
{
	accountNumber = 123456789;
	bankBalance = 10000.5;
	displayDetails(int accountNumber,double bankBalance)
}

void displayDetails(int accountNumber, double bankBalance)
{
	System.out.println("Account number is: "+accountNumber);
	System.out.println("Balance is: "+bankBalance);
}

class BankAccount
{
	public static void main(String... args)
	{
		bankDetails();

	}
	
}