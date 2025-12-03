package com.xworkz.countryrunner;

import lombok.ToString;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
@ToString

public class CountryRunner {
    public static void main(String[] args) {

        Set<String> set=new HashSet<>();
        set.add("India");
        set.add("Australia");
        set.add("Indoneasia");
        set.add("iran");
        set.add("America");
        set.add("UAE");
        System.out.println("Printing all countries");

        for(String st:set) {
            System.out.println(st);
            if (st.length() == 5) {
                System.out.println("country which have length is 5");
                System.out.println(st);
            }
        }
        System.out.println("Which country (i) in country name:");
        for(String sm:set){
            if(sm.contains("i")){
                System.out.println(sm);
            }
        }

        System.out.println("Which country starts whith I or i");
//        for(String mm:set){
//          if( mm.startsWith("I") ){
//              if(mm.startsWith("i"))
//                  System.out.println(mm);
//
//          }
//
//        }
//        Iterator<String> iterator=set.iterator();
//        while (iterator.hasNext()){
//            String st= iterator.next();
//            System.out.println(st);
//        }
        System.out.println("------");
        Iterator<String> iterator=set.iterator();

        while (iterator.hasNext()){
            String mm=iterator.next();
            if(mm.startsWith("i")||mm.startsWith("I"))
                System.out.println(mm);

        }

        System.out.println("The country which  they have (E) in last letter of name:  ");
        Iterator<String> iterator1=set.iterator();
        while (iterator1.hasNext()){
            String ends=iterator1.next();
            if(ends.endsWith("E")||ends.endsWith("e"))
                System.out.println(ends);
        }
        System.out.println("Printing first 2 country names");
                Iterator<String> it=set.iterator();
             //   String mn=it.next();
                if(it.hasNext())
                    System.out.println(it);
                }

    }

