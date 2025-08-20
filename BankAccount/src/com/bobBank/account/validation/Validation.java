package com.bobBank.account.validation;

import com.bobBank.account.savings.SavingsAccount;

public class Validation {
    SavingsAccount savingsAccount;

    double balance;
    boolean isAccountNumber = false;
    boolean isHolderName = false;
    boolean isCurrBalance = false;
    boolean isDeposit = false;
    boolean isCredit = false;
    boolean isValid = false;

    public boolean val(SavingsAccount savingsAccount) {
        this.savingsAccount=savingsAccount;
        if (savingsAccount.getAccNumber() != 0 && String.valueOf(savingsAccount.getAccNumber()).length() == 16) {
            isAccountNumber = true;
        } else {
            System.out.println("Invalid, Give 16 digit account number");
        }
        if (savingsAccount.getHolderName() != null) {
            isHolderName = true;
        } else {
            System.out.println(" Holder Name Invalid");
        }
        if (savingsAccount.getCurBalance() != 0) {
            isCurrBalance = true;

        } else {
            System.out.println("Balance Invalid");
        }
        if (savingsAccount.getDeposit() > 0 && savingsAccount.getDeposit() <= savingsAccount.getCurBalance()) {
            isDeposit = true;
            //balance=savingsAccount.getCurBalance()-savingsAccount.getDeposit();
        } else {
            System.out.println("Deposit Invalid");
        }
        if (savingsAccount.getCredit() > 0) {
            isCredit = true;
          // balance=savingsAccount.getCurBalance()+savingsAccount.getCredit();

        }
        if (isAccountNumber && isHolderName && isCurrBalance && isDeposit && isCredit) {
            isValid = true;
        } else {
            System.out.println("The input is Invalid, please give correct formate");
        }
        return isValid;
    }
    public void debitUpdate(){
        balance=savingsAccount.getCurBalance()-savingsAccount.getDeposit();

    }
    public void creditUpdate(){
         balance=savingsAccount.getCurBalance()+savingsAccount.getCredit();

    }

    public void getInfo() {
        System.out.println("Bank Account number: " + savingsAccount.getAccNumber());
        System.out.println("Account Holder Name: " + savingsAccount.getHolderName());
        System.out.println("Deposit amount: " + savingsAccount.getDeposit());
        System.out.println("Credit amount: " + savingsAccount.getCredit());
        System.out.println("The Current Balance: "+savingsAccount.getCurBalance());
    }


}
