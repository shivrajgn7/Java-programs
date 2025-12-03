package com.appolo.guidlines.impl;

import com.appolo.guidlines.HospitalGuidLines;
import com.appolo.guidlines.patients.Patient;

import java.util.ArrayList;
import java.util.List;

public class AppoloImpl implements HospitalGuidLines {

    List<Patient> pt=new ArrayList<>();


    @Override
    public boolean addPatient(Patient patient) {
        boolean isPatientAdded = false;
        if (patient != null) {
            pt.add(patient);
            isPatientAdded = true;
        }
        return isPatientAdded;
    }



    @Override
    public boolean doGeneralCheck() {
        return false;
    }



    @Override
    public void getAllPatient(){

        for(Patient allPatient:pt){
            System.out.println("The patient name: "+allPatient.getName());
            System.out.println("The patient age: " +allPatient.getAge());
            System.out.println("The patient disease: "+allPatient.getDisease());
            System.out.println("The patient address: "+allPatient.getAddress());
        }

    }

    @Override
    public String getPatientNameById(Patient patient) {
        String isval=null;
        if(patient.getPatientId()==patient.getPatientId()) {
            isval = patient.getName();
        }
        return isval;
    }
}
