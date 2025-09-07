package com.appolo.hospital;

import com.appolo.hospital.patient.Patient;

import java.util.Scanner;

public class HospitalRunner {

    public static void main(String [] args){


        Hospital hospital = new Hospital();


        Patient patient = new Patient();
        patient.setPatientID(1);
        patient.setPatientName("Baba");
        patient.setAge(45);
        hospital.addPatient(patient);

        Patient patient1 =new Patient();
        patient1.setPatientID(2);
        patient1.setPatientName("rahul");
        patient1.setAge(23);

        hospital.addPatient(patient1);


        Patient patient2 =new Patient();
        patient2.setPatientID(0);
        patient2.setPatientName(null);
        patient2.setAge(0);
        hospital.addPatient(patient2);

        hospital.ageUpdated(54,2);
        hospital.getAllPatients();



    }

}

