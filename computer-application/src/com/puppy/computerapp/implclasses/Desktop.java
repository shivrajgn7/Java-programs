package com.puppy.computerapp.implclasses;

import com.puppy.computerapp.contract.Computer;

public class Desktop implements Computer {


    @Override
    public void staticComputer() {
        System.out.println("Desktop application");
    }

    @Override
    public void mobileCoputer() {
        System.out.println("Laptop application");
    }

    @Override
    public void applicationComp() {
        System.out.println("tab application");
    }
}
