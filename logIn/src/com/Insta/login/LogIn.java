package com.Insta.login;

import com.Insta.login.email.Email;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Email email=new Email();
        email.setEmail(45678,"shivu@123");
        //System.out.println("User Id is: "+email.getUser());
        //System.out.println("Password : "+email.getPas());

        Scanner sc=new Scanner(System.in);

        int pasValid=sc.nextInt();
        String userValid=sc.nextLine();
        if(userValid==email.getUser()){
            if(pasValid==email.getPas()){
                System.out.println("Login succesful");
            }
            else
                System.out.println("not valid username and password");
        }
        System.out.println("Main Ended");

    }

    }


