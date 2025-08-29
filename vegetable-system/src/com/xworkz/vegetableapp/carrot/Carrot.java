package com.xworkz.vegetableapp.carrot;

import com.xworkz.vegetableapp.vegetable.Vegetable;

public class Carrot extends Vegetable {
    public Carrot(){
        super();
        System.out.println("Carrot cons is invoked");
    }
    @Override
    public void todo(){
        System.out.println("to do Halwa");
    }
}
