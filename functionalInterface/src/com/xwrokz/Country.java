package com.xwrokz;

import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Country {
    public static void main(String[] args) {


        List<String> countrys=new LinkedList<>();
        countrys.add("India");
        countrys.add("Australia");
        countrys.add("Indoneasia");
        countrys.add("iran");
        countrys.add("America");
        countrys.add("UAE");

        Stream<String > countryStream=countrys.stream();

        System.out.println("Country name starts with I");
        countryStream.filter(c->c.startsWith("I")).forEach(System.out::println);
        Stream<String > countryStream1=countrys.stream();

        System.out.println("Country name ends with A: ");
        List<String> anotherCountry=countryStream1.filter(country->country.endsWith("a")).collect(Collectors.toList());
        System.out.println(anotherCountry);

        System.out.println("Country which have length is 5 :");
        countrys.stream().filter(v->v.length()==5).forEach(System.out::println);


        countrys.stream().sorted().forEach(System.out::println);


        Date date=new Date();
        LocalDate date1= LocalDate.now();
        System.out.println(date1);

    }
}
