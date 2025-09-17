package com.xworkz.helmet.imply;
import com.xworkz.helmet.Helmet;
public class HelmateImply implements Helmet {
    public void bluePrint(){
        System.out.println("blue print is ready");
    }

    public int noOfOrders(int noOfOrder){
        return noOfOrder;
    }

    public boolean isGoodQuality(boolean isGood){
        return isGood;
    }

}
