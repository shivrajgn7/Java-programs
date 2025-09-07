package com.groww.account;

import com.groww.account.Validation.Validation;
import com.groww.account.register.Register;

public class AccountRunner {
    public static void main(String[] args) {
        Register register=new Register();
        register.setName("Shivraj");
        register.setNomineesName("Nagaraj");
        register.setClientCode(1234567890123456L);
        register.setDematNumber(1234567890L);
        register.setDpId(12345678);

        Validation validation=new Validation();
        if(validation.valid(register)){
            validation.getInfo();
        }
    }
}
