package com.sbi.bankaccount.savings;

import com.sbi.bankaccount.account.BankAccount;

public class SavingAccount extends BankAccount {

   public SavingAccount(){
        System.out.println("zero balance");
    }
    public SavingAccount(double minBalance){

       this.credit(minBalance);
    }
}
