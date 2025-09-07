package com.xworkz.instituterunner;

import com.xworkz.instituterunner.Institute.Institute;
import com.xworkz.instituterunner.trainee.Trainee;

import java.util.Scanner;

public class InstituteRunner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Trainee");
        int size=sc.nextInt();
        Institute institute=new Institute(size);
    for(int i=0;i<size;i++) {
        System.out.println("Enter the trainee Id");
        int traineId=sc.nextInt();
        Trainee trainee = new Trainee();
        trainee.setTraineeId(traineId);

        System.out.println("Enter the trainee name: ");
        String traineName=sc.next();
        trainee.setName(traineName);

        System.out.println("Enter the trainee taking subject");
        String takenSubject=sc.next();
        trainee.setTakenSubject(takenSubject);
        institute.addTrainee(trainee);


    }
        institute.getAllData();

    }
}
