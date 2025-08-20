package com.karnataka.karOne;

import com.karnataka.karOne.log.LogIn;
import com.karnataka.karOne.validation.Validation;

import java.util.Scanner;

public class KarOneRunner {
    public static void main(String[] args) {
    LogIn log=new LogIn();
        Validation val=new Validation();
        val.validate(log);
    Scanner sc=new Scanner(System.in);
        //System.out.println("Enter login Id");
        //String logG=sc.nextLine();
        System.out.println("Enter First Name : ");
    String givName=sc.nextLine();
        System.out.println("Enter Sec Name: ");
    String secName=sc.nextLine();
        System.out.println("Enter gmail is: ");
    String gmail=sc.nextLine();
        System.out.println("Enter login Id: ");
        String userId=sc.nextLine();


        System.out.println("Enter the Password");
    String pass=sc.nextLine();
        System.out.println("Enter Confirm Password: ");
    String conPass=sc.nextLine();
        System.out.println("Enter mobile number: ");
        long mblNo=sc.nextLong();

    log.setFullName(givName);
        System.out.println("The given name: "+log.getFullName());

        log.setSecName(secName);
        System.out.println("The sec name: "+log.getSecName());

        log.setGmail(gmail);
        System.out.println("Gmail is is: "+log.getGmail());

        log.setMblNumber(mblNo);
        System.out.println("The mobile number is: "+log.getMblNumber());

        log.setLoginId(userId);
        System.out.println("Login Id is: "+log.getLoginId());

        log.setPassword(pass);
        System.out.println("Password: "+log.getPassword());

        log.setConfirmPassword(conPass);
        System.out.println("Confirm Password: "+log.getConfirmPassword());




    }
}
