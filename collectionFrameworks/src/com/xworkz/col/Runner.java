package com.xworkz.col;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Collection collection=new ArrayList();

        collection.add(1);
        collection.add(34);
        collection.add(34);
        collection.add("skff");
        collection.add(798765345678L);

       // System.out.println(collection);

        Collection collection1=new LinkedHashSet();
        try {
            collection1.add(567);


        }catch (Exception e){
            e.printStackTrace();
        }
        collection1.add("343");
        collection1.add("sjsj");


        collection.hashCode();

       // System.out.println(collection1);

        Collection collection2=new TreeSet();

        collection2.add("Baba");
        collection2.add("babi");
        collection2.add("Ajsj");

        collection2.addAll(collection1 );


//        for(Object o: collection2){
//
//        }

        System.out.println(collection2);

    }
}
