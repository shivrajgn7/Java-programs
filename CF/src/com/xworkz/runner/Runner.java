package com.xworkz.runner;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        Set collection =new HashSet();

        collection.add(1);
        collection.add("babi");
        collection.add("Baba");
        collection.add("Amar");
        collection.add("Amar");
        collection.add(null);

        System.out.println(collection);

        List<String> list=new ArrayList();
       // list.add(45,collection );
        list.add("mmmm");
       //   list.add(34);
       // list.add(collection );
        list.add("Amar");
      //  System.out.println(list.size());
        list.add("Amar");
        list.add("Amar");
        list.add("VArun");
        list.add("Amar");
        list.add("Amar");
        list.add("Amar");
        list.add("Amar");
        list.add("Amar");
        list.add("Amar");
        list.add("Amar");

        Collections.sort(list);
        System.out.println(list);



      //  for


//        System.out.println(list);
//        for(Object st: collection){
//            System.out.println(st);
//        }
//
       List list1=new LinkedList();
        list1.add("linked");
        list1.add("linked");
        list1.add(null);
        list1.add(list);

        System.out.println("Linked List:");
        System.out.println(list1);
        list1.remove(list);
        System.out.println("Sorted  linked list");
        System.out.println();
       // Collections.sort(list1);

        System.out.println(list1);

        Set vector =new LinkedHashSet();

        vector.add(1);
        vector.add("babi");
        vector.add("Baba");
        vector.add("Amar");
        vector.add("Amar");
        vector.add(null);
        vector.add(null);

        System.out.println(vector);




    }
}
