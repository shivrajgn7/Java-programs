package com.xworkz.plasticapp;

import com.xworkz.plasticapp.bottle.Bottle;
import com.xworkz.plasticapp.plastic.Plastic;

public class PasticRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Plastic plastic1 = new Bottle();
        plastic1.toStoreWater();
        System.out.println("main ended");

    }
}
