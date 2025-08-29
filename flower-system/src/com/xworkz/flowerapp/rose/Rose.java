package com.xworkz.flowerapp.rose;

import com.xworkz.flowerapp.flower.Flower;

public class Rose extends Flower {
    public Rose(){
        super();
        System.out.println("Rose cons is invoked");
    }
    @Override
    public void toDecoration(){
        System.out.println("to do decoration and flower bhocke ");
    }

}
