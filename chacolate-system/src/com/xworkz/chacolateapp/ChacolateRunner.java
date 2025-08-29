package com.xworkz.chacolateapp;

import com.xworkz.chacolateapp.chacolate.Chacolate;
import com.xworkz.chacolateapp.dairymilk.DairyMilk;

public class ChacolateRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Chacolate chocolate1 = new DairyMilk();
        chocolate1.avaliable();
        System.out.println("main ended");

    }
}
