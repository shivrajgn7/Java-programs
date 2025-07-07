class BankAccountRunner{
	public static void main(String[]Bank){
	System.out.println("Main Started");
	
		BankAccount.credit(0.00);
			System.out.println("The current balance is"+ BankAccount.balance);
			
		BankAccount.debit(999.00);
			System.out.println("The current balance is"+ BankAccount.balance);
			
	System.out.println("Main ended");
	
	}
}
