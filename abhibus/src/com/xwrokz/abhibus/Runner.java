package com.xwrokz.abhibus;

import com.xwrokz.abhibus.contracts.SrsImpl;
import com.xwrokz.abhibus.contracts.VrlImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main started");

//
//        AbhiBus vrl=new VrlImpl();
//        vrl.isMinBooking();
//        vrl.isGoodCondition();
//
//        AbhiBus srs=new SrsImpl();
//        srs.isMinBooking();
//        srs.isGoodCondition();


        Collection collection=new ArrayList();
        collection.add(23);
        collection.add(23);
        collection.add("virat");
        Collection collection1=new ArrayList();
        collection1.add("fdslflsd");
        collection.retainAll(collection1);
        System.out.println(collection1);

        String  myst="fim";
        System.out.println("getclass: "+myst.hashCode());

    }
}
