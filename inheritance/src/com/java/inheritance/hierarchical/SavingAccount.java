package com.java.inheritance.hierarchical;

public class SavingAccount extends  BankAccount{
    String holderName;
    public void saveings(){
        System.out.println("Saving accounnt holder name: "+holderName);
    }
    public  void setSavingsHolderName(String holderName){
        this.holderName=holderName;
    }
}
