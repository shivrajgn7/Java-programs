package com.xworkx.calculator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ScientificHospital extends  Calculator{

    private int scid;
    private String scName;

    public void sin(){
        System.out.println("Sin theta");
    }
    public void cos(){
        System.out.println("cos theta");

    }
    public  void tan(){
        System.out.println("tan theta");
    }
    public double exponential(int a,int b){
        double val=Math.pow(a,b);
        System.out.println("Exponenti1al: "+val);
        return val;

    }

}
