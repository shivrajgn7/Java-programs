package com.xworkz.emp;

import com.xworkz.emp.dto.EmployeDto;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<EmployeDto> employeDtos = new LinkedList<>();


        employeDtos.add(new EmployeDto(23, "Shivraj", "GN", 2019, 50000, "Tech", 21, "male", "Bengaluru"));
        employeDtos.add(new EmployeDto(45, "Varun", "Aradhya", 2014, 70000, "Tech", 23, "male", "Bengaluru"));
        employeDtos.add(new EmployeDto(75, "Arun", "Gowda", 2022, 20000, "Civil", 31, "male", "shimoga"));
        employeDtos.add(new EmployeDto(12, "Chethan", "naik", 2019, 5000, "HR", 27, "male", "chikkamagaluru"));
        employeDtos.add(new EmployeDto(65, "rithu", "mandavi", 2017, 3000, "Tech", 26, "female", "Hydhrabadh"));
        employeDtos.add(new EmployeDto(23, "anu", "a", 2019, 800, "Tech", 21, "female", "Bengaluru"));
        employeDtos.add(new EmployeDto(55, "sanvi", "joseph", 2012, 15000, "Civil", 25, "female", "chikkamagaluru"));


        //   System.out.println("Sortd by Id");
        //   employeDtos.stream().sorted((o1,o2)->o1.getEmpId()-o2.getEmpId()).forEach(System.out::println);

        //  System.out.println("Filter whoes age is less than 25");
        //  employeDtos.stream().filter(o1->o1.getAge()<25).forEach(System.out::println);

        //        System.out.println("using distinct method");
        //        employeDtos.stream().map(EmployeDto::getFirstName).distinct().forEach(System.out::println);

        //  System.out.println("get distinct department from the list");
        // employeDtos.stream().map(EmployeDto::getDepartment).distinct().forEach(System.out::println);

        //Dought::
        //  System.out.println("get Arun name from cevil department:");
        //  employeDtos.stream().map(EmployeDto::getDepartment).filter((m1)->m1.startsWith("C")).filter(r1->r1.startsWith("A")).forEach(System.out::println);

        //  System.out.println("Secound heighest sallary person: ");
        // System.out.println(employeDtos.stream().sorted(Comparator.comparing(EmployeDto::getSalary).reversed()).skip(1).findFirst());

        //System.out.println("Third heighest salary: ");
        //System.out.println(employeDtos.stream().sorted(Comparator.comparing(EmployeDto::getSalary).reversed()).skip(2).findFirst());


        //dought
        //System.out.println("Get the number of male and fmale");
        //System.out.println(employeDtos.stream().collect(Collectors.groupingBy(EmployeDto::getGender, Collectors.counting())));

        // System.out.println("Sort the employe based on salary ");
        // employeDtos.stream().sorted(Comparator.comparing(EmployeDto::getSalary).reversed()).forEach(System.out::println);

        //dought
        //System.out.println("Sort the employe based on Date of Joining: ");
        //employeDtos.stream().sorted(Comparator.comparing(EmployeDto::getDateOfJoining).reversed()).forEach(System.out::println);

        //System.out.println("Sort the employe based on age: ");
        //employeDtos.stream().sorted(Comparator.comparing(EmployeDto::getAge)).forEach(EmployeDto-> System.out.println(EmployeDto));

        //  System.out.println("Sort the employe who is oldest employe in the company: ");
        //System.out.println(employeDtos.stream().sorted(Comparator.comparing(EmployeDto::getAge).reversed()).findFirst());
        // System.out.println(employeDtos.stream().max(Comparator.comparing(EmployeDto::getAge)).get());
//        System.out.println(employeDtos.stream().mapToInt(EmployeDto::getAge).max().orElse(3));
//
//        System.out.println("Min age of employe");
//        System.out.println(employeDtos.stream().mapToInt(EmployeDto::getAge).min().orElse(1));

        // System.out.println("Sorting using first and last name: ");
        // employeDtos.stream().sorted(Comparator.comparing(EmployeDto::getFirstName).thenComparing(EmployeDto::getLastName)).forEach(EmployeDto-> System.out.println(EmployeDto));

//        System.out.println("How many number of name are there by number : ");
//        System.out.println(employeDtos.stream().collect(Collectors.groupingBy(EmployeDto::getFirstName, Collectors.counting())));
//
//        System.out.println("get the employe who joined in 2019 ");
//        System.out.println(employeDtos.stream().filter(o1 -> o1.getDateOfJoining() == 2019).collect(Collectors.groupingBy(EmployeDto::getDateOfJoining, Collectors.counting())));
//
//        System.out.println("Get the male and female employee from each department: ");
//        System.out.println(employeDtos.stream().collect(Collectors.groupingBy(EmployeDto::getDepartment, Collectors.groupingBy(EmployeDto::getGender, Collectors.counting()))));
//
//        System.out.println("Heighest salary based on each department: ");
        //find lowest paid salary in each based on each gender
        //find heighest paid salary in the organization based on gender,
        //print the top 2 heighesst salary earned employees in each department

        //System.out.println(employeDtos.stream().collect(Collectors.groupingBy(EmployeDto::getDepartment,Collectors.maxBy(Comparator.comparing(EmployeDto::getSalary)))));

//        System.out.println("Find lowest paid salary in each based on each gender: ");
//        System.out.println(employeDtos.stream().collect(Collectors.groupingBy(EmployeDto::getGender, Collectors.minBy(Comparator.comparing(EmployeDto::getSalary)))));
//
//        System.out.println("Find heighest paid salary in each based on each gender");
//        System.out.println(employeDtos.stream().collect(Collectors.groupingBy(EmployeDto::getGender, Collectors.maxBy(Comparator.comparing(EmployeDto::getSalary)))));
//
//        System.out.println("Print the top 2 heighest salary earned employee in each department: ");
//        System.out.println(employeDtos.stream().sorted(Comparator.comparing(EmployeDto::getSalary).reversed()).skip(1).collect(Collectors.groupingBy(EmployeDto::getDepartment, Collectors.maxBy(Comparator.comparing(EmployeDto::getSalary)))));

//        System.out.println("Print the first 2 highest salary employe by each department: ");
//        employeDtos.stream()
//               .collect(Collectors.groupingBy(EmployeDto::getDepartment))
//                .forEach((departmentName, employee) -> {
//                    employee.
//                            stream().
//                            sorted(Comparator.comparing(EmployeDto::getSalary).
//                            reversed()).
//                            limit(2).
//                            forEach(System.out::println);
//                });



//        System.out.println("Print averege age of male and female employee : ");
//        System.out.println( employeDtos.stream().collect(Collectors.groupingBy(emp -> emp.getAge(),
//               Collectors.averagingInt( value -> value.getAge()))));

//        System.out.println("Find all the employe who lives in 'Banglore' city sort them by their name and print names of employee");
//    employeDtos.stream().filter(o1->o1.getAddress().equals("Bengaluru")).collect(Collectors.groupingBy(EmployeDto::getFirstName)).forEach(  (names, emp) -> System.out.println(names));

  //      System.out.println(" Find lowest paid salary in each department based on the gender.  ");
        //   System.out.println(employeDtos.stream().collect(Collectors.groupingBy(EmployeDto::getGender,Collectors.minBy(Comparator.comparing(EmployeDto::getSalary)))));

    //    System.out.println("Find the department names that these employees work for, where the number of employees in the department is over 3");
   //     System.out.println( employeDtos.stream().filter((o1)->o1.getDepartment().length()>=3).collect(Collectors.groupingBy(EmployeDto::getDepartment)));

//        List<Integer> number=new LinkedList<>();
//        number.add(new Integer(mn=23));

        System.out.println("Increase employee salary of 15% in after one year ");
        System.out.println ( employeDtos.stream().map(employeDto -> new EmployeDto((employeDto.getEmpId(),
                employeDto.getFirstName(),employeDto.getDateOfJoining(),
                employeDto.getSalary()+(employeDto.getSalary()*0.15),
                employeDto.getDepartment(),employeDto.getAge(),employeDto.getGender(),
                employeDto.getAddress())).collect(Collectors.toList()));





    }
}
