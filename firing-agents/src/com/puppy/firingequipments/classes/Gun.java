package com.puppy.firingequipments.classes;

import com.puppy.firingequipments.interfaces.FiringDetails;

public class Gun implements FiringDetails {

    @Override
    public void set() {
        System.out.println("We can set the gun to shoulder level");
    }

    @Override
    public void fire() {
        System.out.println("Fire bullet by triggering triggerer");

    }

    @Override
    public void range() {
        System.out.println("gun range is upto 250 mtrs");
    }
}
