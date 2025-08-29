package com.xworkz.plasticapp.bottle;

import com.xworkz.plasticapp.plastic.Plastic;

public class Bottle extends Plastic {
    public Bottle(){
        super();
        System.out.println("Bottle cons is invoked");
    }
    public void toStoreWater(){
        System.out.println("it will store to drink ");
    }
}
