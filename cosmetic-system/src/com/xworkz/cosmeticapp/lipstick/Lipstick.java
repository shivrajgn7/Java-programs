package com.xworkz.cosmeticapp.lipstick;

import com.xworkz.cosmeticapp.cosmetics.Cosmetics;

public class Lipstick extends Cosmetics {
    public Lipstick(){
        super();
        System.out.println("Lipstick cons is invoked");
    }
    @Override
    public void toMakeUp(){
        System.out.println("to do coloring only for lips");
    }
}
