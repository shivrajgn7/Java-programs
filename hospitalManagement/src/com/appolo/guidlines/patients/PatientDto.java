package com.appolo.guidlines.patients;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PatientDto {
    private int patientId;
    private String name;
    private int age;
    private String disease;
    private String address;
    private long contactNo;
}
