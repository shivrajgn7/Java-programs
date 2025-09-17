package com.xworkz.helmet;

import com.xworkz.helmet.imply.HelmateImply;

public class HelmetRunner {
    public static void main(String[] args) {


        Helmet helmet = new HelmateImply();
        helmet.bluePrint();
        System.out.println(helmet.noOfOrders(56));
        System.out.println(helmet.isGoodQuality(true));

    }
}
