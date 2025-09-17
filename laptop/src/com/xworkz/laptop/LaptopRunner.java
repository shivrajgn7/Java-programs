package com.xworkz.laptop;

import com.xworkz.laptop.implementation.LaptopImplementation;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop=new LaptopImplementation();
        laptop.display();
        laptop.keyBoard();
    }
}
