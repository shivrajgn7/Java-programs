package com.xworkz.instrumentapp;

import com.xworkz.instrumentapp.guitar.Guitor;

public class InstrumentRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Guitor instrument1 = new Guitor();
        System.out.println("main ended");

    }
}
