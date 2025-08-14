package com.bobBank.account.savings;

public class SavingsAccount {
    private long accNumber;
    private String holderName;
    private double curBalance;
    private double deposit;
    private double credit;

    public long getAccNumber(){
        return accNumber;
    }
    public void setAccNumber(long accNumber){
        this.accNumber=accNumber;
    }
    public  String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName){
        this.holderName=holderName;
    }

    public double getCurBalance(){
        return  curBalance;
    }
    public  void setCurBalance(double curBalance){
        this.curBalance=curBalance;
    }
    public  double getDeposit(){
        return  deposit;
    }
    public  void setDeposit(double deposit){
        this.deposit=deposit;
    }
    public  double getCredit() {
        return credit;
    }
    public  void setCredit(double credit){
        this.credit=credit;
    }
}
