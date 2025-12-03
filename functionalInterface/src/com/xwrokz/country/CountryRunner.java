package com.xwrokz.country;

import com.xwrokz.comparator.EmployDto;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class CountryRunner {
    public static void main(String[] args) {
        List<CountryDto> countryDtoList=new LinkedList<>();
        countryDtoList.add(new CountryDto(43,"India",1450000000,"Modi",28,3282236,"Asia",true,"Kannada"));
        countryDtoList.add(new CountryDto(63,"Indonesia",280000000,"Subianto",38,1904569,"Asia",false,"English"));
        countryDtoList.add(new CountryDto(1, "India", 1462, "Narendra modi", 28, 32887, "Asia", true, "Kannada"));
        countryDtoList.add(new CountryDto(2, "United States", 332, "Joe Biden", 50, 9834, "North America", true, "English"));
        countryDtoList.add(new CountryDto(3, "Brazil", 214, "Luiz Inácio Lula da Silva", 26, 8516, "South America", true, "Portuguese"));
        countryDtoList.add(new CountryDto(5, "Germany", 84, "Olaf Scholz", 16, 98357, "Europe", true, "German"));
        countryDtoList.add(new CountryDto(6, "South Africa", 61, "Cyril Ramaphosa", 9, 1221, "Africa", true, "Zulu"));
        countryDtoList.add(new CountryDto(7, "Canada", 39, "Justin Trudeau", 13, 9985, "North America", true, "English"));
        countryDtoList.add(new CountryDto(8, "China", 1412, "Xi Jinping", 23, 9597, "Asia", false, "Mandarin"));
        countryDtoList.add(new CountryDto(9, "Japan", 125, "Fumio Kishida", 47, 9378, "Asia", true, "Japanese"));
        countryDtoList.add(new CountryDto(10, "United Kingdom", 67, "Rishi Sunak", 4, 8243, "Europe", true, "English"));
        countryDtoList.add(new CountryDto(11, "France", 65, "Emmanuel Macron", 18, 5551, "Europe", true, "French"));
        countryDtoList.add(new CountryDto(12, "Russia", 146, "Vladimir Putin", 85, 17098, "Europe/Asia", false, "Russian"));
        countryDtoList.add(new CountryDto(13, "Mexico", 129, "Andrés Manuel López Obrador", 32, 1964, "North America", true, "Spanish"));
        countryDtoList.add(new CountryDto(14, "Egypt", 112, "Abdel Fattah el-Sisi", 27, 1002, "Africa", false, "Arabic"));
        countryDtoList.add(new CountryDto(15, "Argentina", 46, "Javier Milei", 23, 2780, "South America", true, "Spanish"));
        countryDtoList.add(new CountryDto(16, "Saudi Arabia", 37, "Mohammed bin Salman", 13, 2150, "Asia", false, "Arabic"));
        countryDtoList.add(new CountryDto(17, "Italy", 59, "Giorgia Meloni", 20, 301, "Europe", true, "Italian"));
        countryDtoList.add(new CountryDto(18, "South Korea", 52, "Yoon Suk Yeol", 17, 100, "Asia", true, "Korean"));

        countryDtoList.add(new CountryDto(20, "Nigeria", 223, "Bola Ahmed Tinubu", 36, 924, "Africa", true, "English"));
        System.out.println("Continental names:");
        System.out.println(countryDtoList.stream().map(CountryDto::getContinentName).distinct().collect(Collectors.toList()));

//        List<CountryDto> emp=countryDtoList.stream().sorted((o1, o2)->o1.getAreaInKm()-o2.getAreaInKm()).collect(Collectors.toList());
//        System.out.println("Sorting by area sq km :"+emp);

        countryDtoList.stream().max(Comparator.comparing(CountryDto::getPopulation));


    }
}