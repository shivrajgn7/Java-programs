package com.xworkz.cricketerapp.virat;

import com.xworkz.cricketerapp.cricketer.Cricketer;

public class Virat extends Cricketer {


    public Virat(){
        super("name");
        System.out.println("Virat  zero cons is invoked");
    }

    public Virat(String name){
        super(name);
        System.out.println("child class parameter constructor is invoked");
    }

}
