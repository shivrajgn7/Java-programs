package com.xworkz.flowerapp;

import com.xworkz.flowerapp.flower.Flower;
import com.xworkz.flowerapp.rose.Rose;

public class FlowerRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Flower flower1 = new Rose();
        flower1.toDecoration();
        System.out.println("main ended");

    }
}
