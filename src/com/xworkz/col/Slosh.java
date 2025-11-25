package com.xworkz.col;

import lombok.ToString;

import java.util.*;
@ToString
public class Slosh {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add(2);
        collection.add(3);
        collection.add(3);
        collection.add("shivraj");
        collection.add(32.0);
        collection.add(true);
        System.out.println("Array List: "+collection);


        Collection collection1=new ArrayDeque();
        collection1.add(2);
        collection1.add(3);
        collection1.add("shivraj");
        collection1.add(32.0);
        collection1.add(true);
        System.out.println("Array List Deque: "+collection1);

        Collection collection2=new LinkedList();
        collection2.add(2);
        collection2.add(3);
        collection2.add("shivraj");
        collection2.add(32.0);
        collection2.add(true);
        System.out.println("Linked List: "+collection2);

        Collection collection3=new LinkedHashSet();
        collection3.add(2);
        collection3.add(3);
        collection3.add(3);
        collection3.add("shivraj");
        collection3.add(32.0);
        collection3.add(true);
        System.out.println("Linked hash set: "+collection3);

        Collection collection4=new Vector();
        collection4.add(2);
        collection4.add(3);
        collection4.add(3);
        collection4.add("shivraj");
        collection4.add(32.0);
        collection4.add(true);
        System.out.println("Vector: "+collection4);

        Collection collection5=new PriorityQueue();
        collection5.add(2);
        collection5.add(3);
        collection5.add(3);
        collection5.add(8);
        collection5.add(5);
        collection5.add(4);
        System.out.println("Priority Queue: "+collection5);

        Collection collection6=new HashSet();
        collection6.add(2);
        collection6.add(3);
        collection6.add(3);
        collection6.add("shivraj");
        collection6.add(32.0);
        collection6.add(true);
        System.out.println("Hash set: "+collection6);

        Collection collection7=new TreeSet();
        collection7.add(2);
        collection7.add(3);
        collection7.add(3);
        collection7.add(1);
        collection7.add(32);
        collection7.add(4);
        System.out.println("Tree set: "+collection7);

        Collection<Integer> val=new ArrayList();
        val.add(43);
        val.add(533);
        val.add(04);
        System.out.println(val.stream().mapToInt(Integer::intValue).sum());

        System.out.println(val.stream().map(coll->coll.compareTo(43)));


    }
}
