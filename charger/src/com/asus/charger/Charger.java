package com.asus.charger;

public interface Charger {
    public int input(int inputVolt);
    public boolean isCharging();
    public int noOfWats(int noWats);

}
