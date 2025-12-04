package com.puppy.businessapp;

import com.puppy.businessapp.contracts.Business;
import com.puppy.businessapp.creation.BusinessImpl;

public class Runner {
    public static void main(String[] args) {
        Business business = new BusinessImpl();
        business.doBusiness();
        business.doJob();
        business.doForming();

    }
}
