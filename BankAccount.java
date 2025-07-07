class BankAccount{

	static double balance=1000.00;

	public static void credit(double amount){
		System.out.println("Method Started");
		boolean val=amount>0.00;
		if(val){
		
		balance=balance + amount;
		}else{
			System.out.println("Amount should be greater than zero");
		}
		System.out.println("Method Ended");
		
		}
		
	public static double debit(double amount){
		System.out.println("Method Started");
		boolean val=amount>balance;
		if (val)
			System.out.println("Insufficent Fund");
		
		else
		balance=balance-amount;
		
		System.out.println("Method Ended");

	 return balance;
		}
	}