package com.appolo.guidlines.runner;

import com.appolo.guidlines.HospitalGuidLines;
import com.appolo.guidlines.impl.AppoloImpl;
import com.appolo.guidlines.patients.Patient;

import java.util.Scanner;

public class HospitalRunner {
    public static void main(String[] args) {
        Patient patient=new Patient();
        patient.setName("raj");
        patient.setAge(45);
        patient.setDisease("Corona");
        patient.setAddress("Bengaluru");
        patient.setContactNo(45678l);

        HospitalGuidLines hospitalGuidLines=new AppoloImpl();

        hospitalGuidLines.addPatient(patient);

        hospitalGuidLines.getPatientNameById(patient);

        hospitalGuidLines.getPatientNameById(patient  );

        hospitalGuidLines.getAllPatient();
    }
}
