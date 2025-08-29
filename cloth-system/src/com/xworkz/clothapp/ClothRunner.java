package com.xworkz.clothapp;

import com.xworkz.clothapp.cloth.Cloth;
import com.xworkz.clothapp.shirt.Shirt;

public class ClothRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Cloth cloth1 = new Shirt();
        cloth1.allTypeAvailable();
        System.out.println("main ended");

    }
}
