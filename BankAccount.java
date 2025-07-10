class BankAccount{

   static  double balance = 100.00 ; 
   
   
                      public static    double  getBalance(){	   
							   return balance;
						   }
   

  
// debit
// credit
// transfer
                  // Datatype variableName - parameter
              //<access-specifier> returnType methodName(parameter)
         public   static  void    debit( double amount ){
			 System.out.println("debit started");
			 
			 //  System.out.println(7 + 7) ; 
			            boolean amountCheck =    100.00 <= 200.00 ; 
			               if(amountCheck){
			              balance  =   200.00 - 100.00 ;
						   }
                           else {
							   System.out.println("No funds Available");		
						   }							   
						   System.out.println("debit ended");
			  }
			  
			  // double amount = 200.00
		  public    static  void    credit(double amount){
			   System.out.println("credit started");
			        
				      boolean anyThing =     amount > 0.00 ;    
			                  if( anyThing) {
							balance = 	 balance + amount ; 
							  } else {
								  System.out.println("Amount should be greater than zero");
							  }
							 System.out.println("credit ended");
			   return ;
			 }
			  





}