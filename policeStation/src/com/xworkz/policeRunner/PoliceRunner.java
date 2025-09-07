package com.xworkz.policeRunner;

import com.xworkz.policeRunner.police.Police;
import com.xworkz.policeRunner.station.PoliceStation;

public class PoliceRunner {
    public static void main(String[] args) {
        PoliceStation policeStation=new PoliceStation();

        Police police=new Police();
        police.setPoliceId(34);
        police.setPoliceName("varun");


        Police police1=new Police();
        police1.setPoliceName("arun");
        police1.setPoliceId(223);


        Police police2=new Police();
        police2.setPoliceId(23);
        police2.setPoliceName("raj");

        policeStation.getAllData();
    }
}
