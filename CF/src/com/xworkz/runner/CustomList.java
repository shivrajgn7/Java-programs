package com.xworkz.runner;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    public static void main(String[] args) {

        Trainee trainee=new Trainee(56,"dev","java",true,32,404);
        List<Trainee> list=new ArrayList<>();
        list.add(trainee);

        System.out.println(list);




    }
}
