package com.xworkz.stationaryapp;

import com.xworkz.stationaryapp.haristationary.HariStationary;
import com.xworkz.stationaryapp.stationary.Stationary;

public class StationaryRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Stationary stationary = new HariStationary();
        stationary.provide();
        System.out.println("main ended");

    }
}
