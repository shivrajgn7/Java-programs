package com.xworkz.credit.runner;

import com.xworkz.credit.Credit;
import com.xworkz.credit.imply.CreditImply;

public class CreditRunner {
    public static void main(String[] args) {
        Credit credit=new CreditImply();
        System.out.println(credit.creditCardNo(87658765334l));
        System.out.println(credit.holderName("shivraj"));
        System.out.println(credit.isCredited(87));
    }
}
