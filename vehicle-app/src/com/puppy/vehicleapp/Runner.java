package com.puppy.vehicleapp;

import com.puppy.vehicleapp.classes.Car;
import com.puppy.vehicleapp.interfaces.Vehicle;

public class Runner {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.accelerate();
        vehicle.braking();
        vehicle.isSafety()
    }
}
