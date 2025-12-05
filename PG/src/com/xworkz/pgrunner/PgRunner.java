package com.xworkz.pgrunner;

import com.xworkz.pgrunner.pg.PG;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PgRunner {
    public static void main(String[] args) {
        PG pg=new PG(89,"GoldenVilla",32,60000);
        PG pg1=new PG(99,"GoldenVilla",32,60000);

        PG pg2=new PG(1,"GoldenVilla",32,60000);

        List<PG> list=new ArrayList();
        //pg.toString();
        list.add(pg);
        list.add(pg1);
        list.add(pg2);
        list.stream().sorted(Comparator.comparing(PG::getPgId));

        System.out.println(list);
    }
}
