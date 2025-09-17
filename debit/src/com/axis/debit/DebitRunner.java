package com.axis.debit;

import com.axis.debit.imply.DebitImply;

public class DebitRunner {
    public static void main(String[] args) {
        Debit debit=new DebitImply();
        System.out.println(debit.debitCardNo(56899897990l));
        System.out.println(debit.balance());
        System.out.println(debit.holderName());

    }
}
