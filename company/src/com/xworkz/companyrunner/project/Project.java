package com.xworkz.companyrunner.project;

import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Getter@Setter
public class Project {
    private String  projectName;
    private int noOfWorkers;
    private boolean isCompleted;

    public boolean getIsCompleted(){

        return isCompleted;
    }
    public void setIsCompleted(boolean isCompleted){
        this.isCompleted=isCompleted;
    }

}
