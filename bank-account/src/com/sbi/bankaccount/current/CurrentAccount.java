package com.sbi.bankaccount.current;

import com.sbi.bankaccount.account.BankAccount;

public class CurrentAccount extends BankAccount {

    public CurrentAccount(double minbalance){
        this.credit(minbalance);
        System.out.println("Current account invoked");
    }

}
