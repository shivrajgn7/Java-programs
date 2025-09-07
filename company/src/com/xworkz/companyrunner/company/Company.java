package com.xworkz.companyrunner.company;

import com.xworkz.companyrunner.project.Project;

public class Company {

    Project[] projects;
    public Company(int size){
        projects=new Project[size];

    }
    int index;

    public boolean addProject(Project project){
        boolean isAdded=false;
        if(project!=null){
            projects[index++]=project;
            isAdded=true;
        }else{
            System.out.println("Invalid to add");
        }
        return isAdded;
    }

    public void getAllData(){
        for(Project values:projects){
            System.out.println("The project name: "+values.getProjectName());
            System.out.println("The Project Workers: "+values.getNoOfWorkers());
            System.out.println("Project is completed? "+values.getIsCompleted());
        }
    }
}
