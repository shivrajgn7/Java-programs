package com.xwrokz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class runner {
    public static void main(String[] args) {
        List<Integer> integers=new ArrayList<>();
        integers.add(323);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        Stream<Integer> integerStream=integers.stream();
        System.out.println(integerStream);
        System.out.println(">2");
        integers.stream().filter(mm->mm>2).forEach(System.out::println);
        System.out.println(">3");

       List<Integer> an= integers.stream().filter(nn->nn>3).collect(Collectors.toList());
        System.out.println(an);

        //integerStream.filter(i->i%2==0).forEach(System.out::println);


        Predicate<Integer> integerPredicate=(integer) -> {
          return (integer%2==0);
        };

        integerStream=integerStream.filter(integerPredicate);

       List<Integer> anotherList= integerStream.collect(Collectors.toList());
        System.out.println("Even numbers: ");
        System.out.println(anotherList);


        Predicate<Integer> predicate = (integer) -> {
            return integer % 2 == 0;
        };


       //single line to find even numbers:
        integers.stream().filter(((i) -> i % 2 ==0 )).forEach(System.out::println);

        //terminal operation
        System.out.println("Greater than 3 : ");
        List<Integer> greater=integers.stream().filter(integer -> integer>=3).collect(Collectors.toList());
        System.out.println(greater);








    }
}
