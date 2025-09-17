package com.xworkz.bottel;

import com.xworkz.bottel.imply.Bottelmply;

public class BottelRunner {
    public static void main(String[] args) {
        Bottel bottelmply=new Bottelmply();
        bottelmply.design();
        System.out.println(bottelmply.minBotteltoDesign(45));
        System.out.println(bottelmply.isWaterBottel(true));
    }
}
