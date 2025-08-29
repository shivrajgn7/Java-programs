package com.xworkz.cosmeticapp;

import com.xworkz.cosmeticapp.cosmetics.Cosmetics;
import com.xworkz.cosmeticapp.lipstick.Lipstick;

public class CosmeticsRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Cosmetics cosmetics1 = new Lipstick();
        cosmetics1.toMakeUp();
        System.out.println("main ended");

    }
}
