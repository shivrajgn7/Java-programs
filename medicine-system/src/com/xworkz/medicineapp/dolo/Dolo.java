package com.xworkz.medicineapp.dolo;

import com.xworkz.medicineapp.medicine.Medicine;

public class Dolo extends Medicine {
    public Dolo(){
        super();
        System.out.println("Dolo cons is invoked");
    }
    @Override
    public void getCure(){
        System.out.println("cure the fever");
    }

}
