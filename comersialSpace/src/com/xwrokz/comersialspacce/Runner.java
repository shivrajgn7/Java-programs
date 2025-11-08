package com.xwrokz.comersialspacce;

public class Runner {
    public static void main(String[] args) {

        ComercialSpace comersialSpace =()->{
            System.out.println("Sandwich");
        };
        comersialSpace.doBusiness();

        ComercialSpace comercialSpace1=()->{
            System.out.println("Sarre business");
        };
        comercialSpace1.doBusiness();

        Comercial2 comercial2= (x,y)->{
            System.out.println("addind two number");

            return x+y;
        };
       int total= comercial2.add(45,45);
        System.out.println(total);

    multiplication multiplication=(x,y)->{
        System.out.println("multiplication");
        return x*y;
    };
    int mul=multiplication.mul(25,5);
        System.out.println(mul);

        Modulus modulus=(n,h)->{
            System.out.println("Modulous");
            return n%h;
        };
        double mod=modulus.mouduls(100,10);
        System.out.println(mod);



    }
}
