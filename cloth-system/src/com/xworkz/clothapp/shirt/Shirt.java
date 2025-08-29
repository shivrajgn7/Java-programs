package com.xworkz.clothapp.shirt;

import com.xworkz.clothapp.cloth.Cloth;

public class Shirt extends Cloth {
    public Shirt(){
        super();
        System.out.println("Shirt cons is invoked");
    }

    @Override
    public void allTypeAvailable() {
        System.out.println("only cotton type is available");
    }
}
