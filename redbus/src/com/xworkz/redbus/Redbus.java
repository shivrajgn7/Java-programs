package com.xworkz.redbus;

import com.xworkz.redbus.implementation.RedbusImplementation;

public class Redbus implements RedbusImplementation {
 //   Redbus redbus= new Redbus() ;
   // RedbusImplementation redbusImplementation=new Redbus();
        @Override
        public int minBooking() {
            System.out.println("min booking");
            return 20;
        }

        @Override
        public boolean busConditionisGood() {
            System.out.println("bus have good condition");
            return true;
        }


}
