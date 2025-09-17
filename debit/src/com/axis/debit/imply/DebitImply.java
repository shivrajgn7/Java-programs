package com.axis.debit.imply;

import com.axis.debit.Debit;

public class DebitImply implements Debit {
    public long debitCardNo(long debitNo){
        System.out.println("Debit no: "+debitNo);
        return debitNo;
    }
    public double balance(){
        double balance=1000.00;
        return balance;
    }
    public String holderName(){
        String holderName="sivraj";
        System.out.println("Holder name: "+holderName);
    return  holderName;
    }

}
