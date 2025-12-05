package com.xwrokz.comparator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class EmployDto {
    private int empId;
    private String empName;
    private double salary;
    private String sex;

}
