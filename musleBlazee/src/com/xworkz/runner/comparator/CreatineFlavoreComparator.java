package com.xworkz.runner.comparator;

import com.xworkz.runner.creatine.Creatine;

import java.util.Comparator;

public class CreatineFlavoreComparator implements Comparator<Creatine> {

    @Override
    public int compare(Creatine o1, Creatine o2) {
        return o1.getFlavore().compareTo(o2.getFlavore()) ;
    }
}
