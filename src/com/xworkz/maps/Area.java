package com.xworkz.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Area {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Jayanagara");
        map.put(2,"vijayanagara");
        map.put(3,"JP nagar");
        map.put(4,"RR nagar");
        map.put(5,"malleshwaram");

        Set<Map.Entry<Integer,String>>entry=map.entrySet();
        for(Map.Entry<Integer,String>entry1:entry){
            System.out.println("Key: "+entry1.getKey()+"--values: "+entry1.getValue());
        }

        Iterator<Map.Entry<Integer,String>>itr= entry.iterator();


        System.out.println(map);

        map.forEach((key ,  value ) -> System.out.println(key  + " " + value));

    }
}
