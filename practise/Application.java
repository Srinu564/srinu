package Encapsulation;


	
	//application
	class Atm
	{
		
		private double balance;
		
		
		private Atm(double amount)
		{
			this.balance=amount;
		}
		
		
		public double getBalance()
		{
			return balance;
		}
		public static Atm getInstance(double amount)
		{
			return new Atm(amount);
		}
		public void withdraw(double amt)
		{
			if(amt>0 && amt<=balance)
			{
				balance=balance-amt;
			}else
				System.out.println("insufficient amount");
		}
	}


