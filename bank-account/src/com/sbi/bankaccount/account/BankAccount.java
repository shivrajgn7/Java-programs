package com.sbi.bankaccount.account;

public class BankAccount {
    double balance;
    public  void debit(double amount){
        balance=balance-amount;
    }
    public void credit(double amount){
        balance=balance+amount;
    }

    public void transfer(BankAccount benificiaryAccount,double amount){
        this.debit(amount);
        benificiaryAccount.credit(amount);
    }
}

