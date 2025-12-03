package com.puppy.businessapp.creation;

import com.puppy.businessapp.contracts.Business;

public class BusinessImpl implements Business {
    @Override
    public void doBusiness() {
        System.out.println("I will continue my dad business");
    }

    @Override
    public void doJob() {
        System.out.println("I'm do job instead job because I'm not ready to take risk");

    }

    @Override
    public void doForming() {
        System.out.println("Forming gives me comfirt. So, I will do forming");
    }
}
