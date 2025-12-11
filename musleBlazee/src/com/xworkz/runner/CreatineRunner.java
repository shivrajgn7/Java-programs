package com.xworkz.runner;

import com.xworkz.runner.comparator.CreatineFlavoreComparator;
import com.xworkz.runner.comparator.CreatineNameComparotor;
import com.xworkz.runner.creatine.Creatine;
import javafx.collections.transformation.SortedList;

import java.util.*;

public class CreatineRunner {
    public static void main(String[] args) {
        Creatine creatine=new Creatine(23,"muzzule","watermillon",250,1040,true);

        List<Creatine> list = new ArrayList();
       // String val=creatine.toString();
        list. add(creatine);
        System.out.println(list);
        Creatine creatine1=new Creatine(8 ,"auzzule","aatermillon",250,1040,true);
        Creatine creatine2=new Creatine(8,"auzzule","aatermillon",250,1040,true);
        Creatine creatine3=new Creatine(67,"muzzule","watermillon",250,1040,true);
        list.add(creatine2);
        list.add(creatine3);
        list.add(creatine1);
        //list.remove(creatine3);

//        CreatineNameComparotor comparotor2=new CreatineNameComparotor();
  //      Collections.sort(list ,comparotor2);
        System.out.println("sorted by name");
       System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println("sorted by creatine Id");
//        System.out.println(list);
//
//        CreatineFlavoreComparator creatineflavor=new CreatineFlavoreComparator();
//        Collections.sort(list,creatineflavor);
//        System.out.println("Sorted by flavor");
//        System.out.println(list);

        LinkedList<Integer> list1=new LinkedList<>();
//        list1.add(creatine);
//        list1.add(creatine1);
        list1.add(345);
        list1.add(544);
        list1.add(32);
        list1.add(1);
        list1.add(2,67);
        System.out.println("Printing linked list");
        System.out.println(list1);





       Set<String > set=new LinkedHashSet<>();
        //set.add(creatine1);
        set.add("fdfd");
        set.add("fdfd");
        set.add("12");
        set.add("12");
        set.add("hfd");
        System.out.println("Hash set");
        System.out.println(set);
        //System.out.println(list1.clear(creatine1));

        //List<Creatine> list2=new SortedList<Creatine>();




    }

}
