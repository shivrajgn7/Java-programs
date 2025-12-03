package com.puppy.smatphoneapp.Implclass;

import com.puppy.smatphoneapp.interfaces.PhoneTypes;

public class Vivo implements PhoneTypes {

    @Override
    public void android() {
        System.out.println("Smartphone implementation to android");
    }

    @Override
    public void iphone() {
        System.out.println("Smartphone implementation to iphone");

    }
}
