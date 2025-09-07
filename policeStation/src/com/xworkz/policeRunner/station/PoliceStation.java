package com.xworkz.policeRunner.station;

import com.xworkz.policeRunner.police.Police;

public class PoliceStation {
    Police[] polices=new Police[3];
    int index;

    public boolean addPolice(Police police){
        boolean isAdd=false;
        if(police!=null){
            polices[index++]=police;
            isAdd=true;
        }else {
            System.out.println("invalid");
        }
        System.out.println("police was added");


        return isAdd;
    }


    public void getAllData(){
        System.out.println("The list of police");
        for(Police police:polices){
            System.out.println("The police id:"+police.getPoliceId());
            System.out.println("The police name: "+police.getPoliceName());
        }
    }
}
