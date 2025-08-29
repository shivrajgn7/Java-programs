package com.xworkz.chacolateapp.dairymilk;

import com.xworkz.chacolateapp.chacolate.Chacolate;

public class DairyMilk extends Chacolate {
    public DairyMilk(){
        super();
        System.out.println("the Dairy milk cons is invoked");
    }
    @Override
    public void avaliable(){
        System.out.println("chocolate are available only in India");
    }
}
