package com.java.inheritance.hierarchical;

public class CurrentAccount extends BankAccount {
    String holderName;

    public void setCurrentHolderName(String holderName){
        this.holderName=holderName;
    }
    public  void current(){
        System.out.println("Current account holder Name: "+holderName);
    }
}
