package com.gov.passport.seva;

import com.gov.passport.reg.PassportRegister;

public class PassportSeva {

    PassportRegister passportRegister;

    public void userRegistered(PassportRegister passportRegister){

    boolean login=false;
        boolean isRegisterValid=false;
        boolean isGivenNameValid=false;
        boolean isSurName=false;
        boolean isDob=false;
        boolean isEmail=false;
        boolean sameAsEmailId=false;
        boolean isLogin=false;
        boolean isPassword=false;
        boolean isRegistered=false;

        if(passportRegister.getPassportOffice()!=null){
            isRegisterValid=true;
        }
        else{
            System.out.println("passport office is invalid");
        }
        if(passportRegister.getGivenName()!=null){
            isGivenNameValid=true;

        }else {
            System.out.println("given name is not valid");
        }
        if(passportRegister.getSurName()!=null){
            isSurName=true;

        }else{
            System.out.println("Sur name is invalid");
        }
        if(passportRegister.getDob()!=null){
            isDob=true;
        }else{
            System.out.println("Date of birth is Invalid");
        }
        if(passportRegister.getEmail()!=null) {
            isEmail = true;
        }else{
            System.out.println("Email is Invalid");
        }
        if(passportRegister.getSameAsEmailId()){
            sameAsEmailId=true;
        }else{
            System.out.println("Same email is not valid");
        }
        if(passportRegister.getLogin()!=null){
            isLogin=true;
        }else{
            System.out.println("Login id is invalid");
        }
        if(passportRegister.getPassword()!=null){
            isPassword=true;
        }else{
            System.out.println("Password is invalid");
        }
        if(passportRegister.getIsRegister()){
            isRegistered=true;
        }else{
            System.out.println("NOT rgistered");
        }

        if(isRegistered&&isDob&&isEmail&&isLogin&&isRegisterValid&&isGivenNameValid&&isPassword&&isSurName){
            login=true;
        }else{
            System.out.println("Please fill all the blanks correct form");
        }



       this.passportRegister=passportRegister;


    }


}
