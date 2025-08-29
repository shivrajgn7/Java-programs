package com.xworkz.hospitalapp.apollo;

import com.xworkz.hospitalapp.hospital.Hospital;

public class Apollo extends Hospital {
    public Apollo(){
        super();
        System.out.println("Apollo cons is invoked");
    }
    @Override
    public void admitPatient(){
        System.out.println("admit only general disease Patient");
    }
}
