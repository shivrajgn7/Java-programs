package com.sbi.bankaccount;

import com.sbi.bankaccount.account.BankAccount;
import com.sbi.bankaccount.current.CurrentAccount;
import com.sbi.bankaccount.savings.SavingAccount;

public class BankRunner {
    public static void main(String[] args) {


         BankAccount shivrajAccount=new BankAccount();
        //  shivrajAccount.transfer(friendAccount,1000.00);
        CurrentAccount.dummy();

       SavingAccount shivuAccount = new SavingAccount();
       shivuAccount.credit(60000.00);
        System.out.println();

        shivuAccount.transfer(shivrajAccount,7000);
        System.out.println(shivuAccount.getBalance());
        System.out.println(shivrajAccount.getBalance());

        CurrentAccount business=new CurrentAccount(1000);
        business.credit(50000);
        business.transfer(shivrajAccount,100);
        System.out.println(business.getBalance());
        System.out.println(shivrajAccount.getBalance());



        SavingAccount appasAccount=new SavingAccount();
        appasAccount.credit(5000);
        System.out.println("Balance of appa account"+appasAccount.getBalance());
        appasAccount.transfer(shivrajAccount,500);
        System.out.println("Transfered shivraj account to appa account for 500: "+appasAccount.getBalance());

    SavingAccount homeAccount=new SavingAccount(1000);
    homeAccount.credit(1000);
        System.out.println("balancce of home account"+homeAccount.getBalance());
            homeAccount.transfer(appasAccount,600.00);
        System.out.println("balance of appa acount: "+appasAccount.getBalance());
        System.out.println("Balance of home accounnt: "+homeAccount.getBalance());

   SavingAccount cuurentAccount=new SavingAccount(500);
        System.out.println("Balance of current account: "+cuurentAccount.getBalance());
        cuurentAccount.transfer(homeAccount,700);




/*
    SavingAccount myAccount=new SavingAccount();
    myAccount.transfer(business,800.00);

    SavingAccount anotherAccount=new SavingAccount();
    CurrentAccount items= new CurrentAccount();
    items.transfer(anotherAccount,900);


*/


    }
}
