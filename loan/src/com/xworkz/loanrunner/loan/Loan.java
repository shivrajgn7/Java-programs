package com.xworkz.loanrunner.loan;

import lombok.ToString;

@ToString
public class Loan {
    private int loanId;
    private String loanType;
    private double amt;
    private double intrest;

    public  Loan(int loanId,String loanType,double amt,double intrest){
        this.amt=amt;
        this.loanId=loanId;
        this.loanType=loanType;
        this.intrest=intrest;
    }

}
