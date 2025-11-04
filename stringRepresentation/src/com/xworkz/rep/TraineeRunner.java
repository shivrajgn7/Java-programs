package com.xworkz.rep;

import java.util.Collection;

public class TraineeRunner {
    public static void main(String[] args) {
        Trainee trainee=new Trainee();
        trainee.setTraineId(78);
        trainee.setTraineeName("dec");
        System.out.println(trainee);


        Trainee trainee1=new Trainee();
        trainee1.setTraineId(78);
        trainee1.setTraineeName("dec");

        System.out.println("Hash code: ");
        String name="ikagai";
        System.out.println(name.hashCode());
        //System.out.identityHashCode(name);





    }
}
