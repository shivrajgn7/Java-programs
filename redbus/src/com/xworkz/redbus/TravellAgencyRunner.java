package com.xworkz.redbus;

import com.xworkz.redbus.implementation.RedbusImplementation;
import com.xworkz.redbus.travelAgency.TravellAgency;

public class TravellAgencyRunner {
    public static void main(String[] args) {
        TravellAgency travellAgency=new TravellAgency();

        RedbusImplementation redbus=new Redbus();

      travellAgency.doBusiness(redbus);

    }
}
