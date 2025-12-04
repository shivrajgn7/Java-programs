package com.appolo.guidlines;

import com.appolo.guidlines.patients.Patient;

public interface HospitalGuidLines {
    public boolean addPatient(Patient patient);

    public boolean doGeneralCheck();


    void getAllPatient();

    String getPatientNameById(Patient patient);
}
