package com.sbi.bankaccount.account;

public class BankAccount {

   private  double balance;

    public double getBalance() {
        return balance;
    }

    public  void debit(double amount){
        balance=balance-amount;
    }
    public void credit(double amount){
        balance=balance+amount;
    }
   public BankAccount(){
        super();
        //System.out.println("BAnk account constructor is invoked");
    }
    public  static void dummy(){
        System.out.println("Dummmy method invoked");
    }

    public void transfer(BankAccount benificiaryAccount,double amount){
        this.debit(amount);
        //this.credit(amount);
        benificiaryAccount.credit(amount);
        System.out.println("transfer amount: "+amount);
    }
}

