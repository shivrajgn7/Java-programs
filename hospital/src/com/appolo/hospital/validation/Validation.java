package com.appolo.hospital.validation;

import com.appolo.hospital.patient.Patient;

public class Validation {
    public boolean isValidate(Patient valid){
        boolean isValid=false;
        boolean isName=false;
        boolean isAge=false;
        boolean isId=false;
        if(valid.getPatientName()!=null){
            isName=true;
        }
        if(valid.getPatientID()!=0){
            isId=true;
        }
        if(valid.getAge()!=0){
            isAge=true;
        }
        if(isName&&isId&&isAge){
            isValid=true;
        }
    return isValid;
    }
}
