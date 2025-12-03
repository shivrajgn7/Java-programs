package com.puppy.employeeapp.implclasses;

import com.puppy.employeeapp.employeeinterface.Employee;

public class FullTimeEmployee implements Employee {
    @Override
    public void calculateSalary() {
        double salary = 1230000;
        System.out.println("Salary is "+salary+" LPA");
    }

    @Override
    public void getDetails() {
        System.out.println("Fetching employee details");
    }

    @Override
    public void promote() {
        System.out.println("promoting employee details");
    }
}
