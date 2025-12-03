package com.chethan.abhibusapp.travelagency;

import com.chethan.abhibusapp.contract.AbhiBusContract;

public class TravelAgency {
    AbhiBusContract contract;
    public boolean isBooking(AbhiBusContract contract){
        boolean bookingDone = false;
        if(contract.busConditionIsGood()){
            this.contract = contract;
        }
        return bookingDone;
    }
}
