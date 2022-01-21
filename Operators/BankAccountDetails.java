package FunctionsEx;

public class BankAccountDetails {
	float amount;
	public void deposite(float amt)
	{
		amount=amount+amt;
	}
	public void withdraw(float amt)
	{
		amount=amount-amt;
	}
	public float balance()
	{
		return amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccountDetails account=new BankAccountDetails();
		System.out.println(account.balance());
		account.deposite(20000);
		System.out.println(account.balance());
		account.withdraw(5000);
		System.out.println(account.balance());
	

	}

}


