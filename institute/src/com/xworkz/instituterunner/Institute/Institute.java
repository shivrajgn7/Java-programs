package com.xworkz.instituterunner.Institute;

import com.xworkz.instituterunner.trainee.Trainee;

public class Institute {
    public Institute(int size){
        trainees=new Trainee[2];
    }

    Trainee[] trainees;
    int index;

    public boolean addTrainee(Trainee trainee){
        boolean isAdded=false;
        if(trainee!=null){
            trainees[index++]=trainee;
            isAdded=true;
        }else{
            System.out.println("Invalid to add trainee");
        }
        return isAdded;
    }

    public void getAllData(){
        for(Trainee value:trainees){
            System.out.println("Trainee Id: "+value.getTraineeId());
            System.out.println("Trainee Name: "+value.getName());
            System.out.println("Traine Subject: "+value.getTakenSubject());
        }
    }


}
