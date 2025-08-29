package com.xworkz.stationaryapp.haristationary;

import com.xworkz.stationaryapp.stationary.Stationary;

public class HariStationary extends Stationary {
    public HariStationary(){
        super();
        System.out.println("HariStationary cons is invoked");
    }
    @Override
    public void  provide(){
        System.out.println("provide all stationary");
    }
}
