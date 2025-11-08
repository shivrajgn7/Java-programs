package com.xworkz.emp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.crypto.Data;
import java.util.Date;
@ToString
@Getter
@Setter
@AllArgsConstructor
public class EmployeDto {
    private int empId;
    private String firstName;
    private String lastName;
    private long  dateOfJoining;
    private int salary;
    private String department;
    private int age;
    private String gender;
    private String address;
}
