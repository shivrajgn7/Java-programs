package com.asus.charger.imply;

import com.asus.charger.Charger;

public class ChargerImply implements Charger {
    Charger charger;
    public int input(int inputVolt){
        System.out.println("the input volt it should be 100-240v :"+inputVolt);
        return inputVolt;
    }
    public boolean isCharging(){
        return true;
    }
    public int noOfWats(int noWats){
        System.out.println("No od charging wats: "+noWats);
    return noWats;

    }
}
