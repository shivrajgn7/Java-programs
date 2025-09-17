package com.xworkz.redbus.travelAgency;

import com.xworkz.redbus.Redbus;
import com.xworkz.redbus.implementation.RedbusImplementation;

public class TravellAgency {

    RedbusImplementation redbus;
    public boolean doBusiness(RedbusImplementation redbus){
        boolean bookingDonne=false;

        if(redbus.busConditionisGood()){
            this.redbus=redbus;
            if(this.redbus.minBooking()<20)
                bookingDonne=true;

        }
        return bookingDonne;
    }
}
