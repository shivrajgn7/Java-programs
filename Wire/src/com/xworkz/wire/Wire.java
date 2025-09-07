package com.xworkz.wire;

public class Wire {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Sub sub=new Sub(68,"Rahul");
        sub.getSub();

        System.out.printf("Main ended");
    }
}
