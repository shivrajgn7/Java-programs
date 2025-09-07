package com.appolo.hospital;

import com.appolo.hospital.patient.Patient;
import com.appolo.hospital.validation.Validation;

public class Hospital {

    Patient[] patients =new Patient[3];

    int index;
    Validation validation=new Validation();

    public boolean addPatient(Patient patient) {
      boolean val=  validation.isValidate(patient);
        boolean isPatientAdded = false;
        if (patient != null&&val) {

            patients[index++] = patient;
            isPatientAdded = true;

        } else {
            System.out.println("invalid patient");
        }
        return isPatientAdded;
    }



    public  boolean ageUpdated(int updatedage,int existingid){
        System.out.println("Invoking patient updated age");
        boolean isUpdated=false;
        for (Patient patient:this.patients){
            if(patient.getPatientID()==existingid){
                patient.setAge(updatedage);
                System.out.println("age is updated");
                isUpdated=true;
            }
        }
        if(isUpdated==false) System.out.println("patient id "+existingid+"does not exist");

        return isUpdated;
    }

    public void getAllPatients(){
        System.out.println("List of Patients are :");
        for (Patient patient :patients ) {
            System.out.println("The patient Id is "+ patient.getPatientID());
            System.out.println("The patient Name is "+ patient.getPatientName());
            System.out.println("The patient age is: "+patient.getAge());
            System.out.println("--------------------------------");
        }
    }

}



