package com.puppy.bankaccountapp.implclasses;

import com.puppy.bankaccountapp.interfaces.BankAccount;

public class SavingAccount implements BankAccount {
    @Override
    public void balance() {
        double bal = 12300;
        System.out.println("current balance : "+bal);
    }

    @Override
    public void credit() {
        System.out.println("Amount credited successfully");
    }

    @Override
    public void debit() {
        System.out.println("Amount debited successfully");
    }

    @Override
    public void transfer() {
        System.out.println("Amount transfer successful");
    }
}
