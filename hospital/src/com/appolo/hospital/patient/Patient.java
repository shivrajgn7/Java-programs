package com.appolo.hospital.patient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Patient {

    private  int patientID;
    private String patientName;
    private int age;

}

