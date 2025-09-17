package com.puppy.firingequipments;

import com.puppy.firingequipments.classes.Gun;

public class Runner {
    public static void main(String[] args) {
        Gun gun = new Gun();
        gun.set();
        gun.fire();
        gun.range();
    }
}
