package com.xworkx.calculator;

public class Calculator {

    public static int total;
    public void add(int a,int b){
        total=a+b;
        System.out.println("addition: "+total);
    }
    public  void  sub(int a,int b){
        total=a-b;
        System.out.println("Substraction: "+total);
    }
    public  void mul(int a,int b){
        total=a*b;
        System.out.println("Multiplication: "+total);
    }
    public  void div(int a,int b){
        double total = a / b;
        System.out.println("Division: "+total);
    }
    public  void mod(int a,int b){
       double total=a%b;
        System.out.println("Modeules: "+total);

    }






}
