package com.axis.debit;

public interface Debit {
    public long debitCardNo(long debitNo);
    public double balance();
    public String holderName();
}
