package com.java.inheritance.hierarchical;

public class BankRunner {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.setBankname();
        CurrentAccount currentAccount=new CurrentAccount();
        currentAccount.setCurrentHolderName("Mohan");
        currentAccount.current();
        currentAccount.setBankname();

        SavingAccount savingAccount=new SavingAccount();
        savingAccount.setSavingsHolderName("Shivraj");
        savingAccount.saveings();
        savingAccount.setBankname();
    }
}
