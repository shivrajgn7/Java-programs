package com.asus.charger.runner;

import com.asus.charger.imply.ChargerImply;

public class ChargerRunner {
    public static void main(String[] args) {
        ChargerImply chargerImply=new ChargerImply();
        chargerImply.input(100);
        chargerImply.isCharging();
        chargerImply.noOfWats(100);
    }
}
