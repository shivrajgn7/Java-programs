package com.xworkz.runner;

import com.xworkz.runner.creatine.Creatine;

import java.util.*;

public class CreatineRunner {
    public static void main(String[] args) {
        Creatine creatine=new Creatine(23,"muzzule","watermillon",250,1040,true);

        List<Creatine> list = new ArrayList();
       // String val=creatine.toString();
        list.add(creatine);
        System.out.println(list);

        Collection<Creatine> list1=new HashSet<>();
        list1.add(creatine);
        System.out.println(list1);

    }

}
