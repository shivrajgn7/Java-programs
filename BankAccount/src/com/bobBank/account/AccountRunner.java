package com.bobBank.account;

import com.bobBank.account.savings.SavingsAccount;
import com.bobBank.account.validation.Validation;

import java.util.Scanner;

public class AccountRunner {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 16 digit Account Number");
        long accNo=sc.nextLong();
        //System.out.println("Enter Holder Name");
        //String holderName=sc.nextLine();



        long balance=500;
        savingsAccount.setAccNumber(accNo);
        savingsAccount.setHolderName("Shivraj");




        savingsAccount.setCurBalance(balance);

        Validation validation=new Validation();
           // validation.val(savingsAccount);
            if(validation.val(savingsAccount)) {
                validation.getInfo();
            }else{
                System.out.println("Not valid");
            }
        System.out.println("Enter Deposit amount");
        long depositValue=sc.nextLong();
        savingsAccount.setDeposit(depositValue);
            validation.debitUpdate();
            validation.getInfo();

        System.out.println("Enter Credit Amount");
        long creditValue=sc.nextLong();
        savingsAccount.setCredit(creditValue);
            validation.creditUpdate();
            validation.getInfo();


    }
}
