package com.android;

import com.android.pol.Police;

public class PoliceRunner {
    public static void main(String[] args) {

        Police  police=new Police();
        police.setPoliceId(54,"Banglore",true);
        System.out.println("The police is was: "+police.getPoliceId());
        System.out.println("The place: "+police.getPlace());
        System.out.println("is this station: "+police.getIsStation()   );
       // police.getInfo();
    }
}
