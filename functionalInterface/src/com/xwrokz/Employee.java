package com.xwrokz;

import com.xwrokz.comparator.EmployDto;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    public static void main(String[] args) {
        List<String> empInfo=new LinkedList();
        empInfo.add("Shivraj");
        empInfo.add("Kruthik");
        empInfo.add("Preetham");
        empInfo.add("Chethan");

        Stream<String> empStream=empInfo.stream();

        Predicate<String > empPredicate=st->{
            return st.startsWith("K");
        };
        Predicate<String > empPredicate1=hm->{
            return hm.startsWith("P");
        };
        System.out.println("Starts with P");
        empStream.filter(empPredicate1).forEach(System.out::println);


        //Single line:

        //empInfo.stream().filter(smt->smt.endsWith("n")).forEach(System.out::println);
        empInfo.stream().filter(st->st.endsWith("n")).forEach(System.out::println);

        List<EmployDto> emp=new LinkedList<>();
        emp.add(new EmployDto(43,"Shivraj",56000l,"Male"));
        emp.add(new EmployDto(65,"Chethan",56999l,"Male"));
        emp.add(new EmployDto(8765,"Kruthik",45000l,"Male"));
        emp.add(new EmployDto(432,"Arun",25000l,"Male"));


        System.out.println("Sorted using name:");
        emp.stream().sorted((o1, o2) -> o1.getEmpName().compareTo(o2.getEmpName())).forEach(System.out::println);
        System.out.println("Sorted using Id: ");
        List<EmployDto>ee=emp.stream().sorted((o3,o4)->o3.getEmpId()-o4.getEmpId()).collect(Collectors.toList());
        System.out.println(ee);

        System.out.println("Secound heighest salary: ");
       Optional<EmployDto> vvv= emp.stream().sorted(Comparator.comparing(EmployDto::getSalary).reversed()).skip(1).findFirst();
        System.out.println(vvv);

    }
}
