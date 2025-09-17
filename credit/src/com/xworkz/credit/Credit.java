package com.xworkz.credit;

public interface Credit {
    public long creditCardNo(long creditCardNo);
    public String holderName(String holderName);
    public boolean isCredited(int amt);
}
