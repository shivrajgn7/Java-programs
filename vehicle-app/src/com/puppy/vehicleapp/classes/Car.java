package com.puppy.vehicleapp.classes;

import com.puppy.vehicleapp.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("Increase or decrease speed");

    }

    @Override
    public boolean isSafety() {
        return true;
    }

    @Override
    public void braking() {
        System.out.println("descresing speed");

    }

}
