package com.puppy.bankaccountapp;

import com.puppy.bankaccountapp.implclasses.SavingAccount;
import com.puppy.bankaccountapp.interfaces.BankAccount;

public class Runner {
    public static void main(String[] args) {
        BankAccount acc = new SavingAccount();
        acc.balance();
        acc.credit();
        acc.debit();
        acc.transfer();
    }
}
