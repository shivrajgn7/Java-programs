class BankAccountRunner {

      public static void main(String[] accounts){
	   System.out.println("main started");
	  
	     // methodName();
		   BankAccount.credit(200.00);
		double currentBalance =    BankAccount.getBalance() ;
		   	   System.out.println("The Current Balance is " + currentBalance)  ;
		   
		   BankAccount.debit(100.00);
	   
	   
	   System.out.println("The Current Balance is " + BankAccount.getBalance())  ;
	          
	   
	    System.out.println("main ended");
	   
   }

}