package com.xworkz.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"baba");
        map.put(2,"babi");
        map.put(3,"babu");                      0

        System.out.println( map.get(2));
        map.entrySet();
        Set<Map.Entry<Integer,String>> entries=map.entrySet();
        for(Map.Entry<Integer,String>entry:entries){
            System.out.println("key="+entry.getKey()+"Values:"+entry.getValue());
        }
        //difrent ways to print keys and values using entrySet()
        for (Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println("Key="+entry.getValue());
        }

//Iterator
        Set<Map.Entry<Integer,String >>entrySet=map.entrySet();
        Iterator<Map.Entry<Integer,String>> itr=entrySet.iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String>entry=itr.next();
            System.out.println("values "+entry.getValue()+" --- "+entry.getKey());
        }

        for(Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println("Key = "+entry.getKey() + ",Values = "+entry.getValue());
        }

        map.forEach((key,values)-> System.out.println("Key= "+key+" values= "+values));
        System.out.println(map);


    }
}
