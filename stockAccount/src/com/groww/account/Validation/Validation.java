package com.groww.account.Validation;

import com.groww.account.register.Register;

public class Validation {
    Register register;

    boolean isName = false;
    boolean isNominee = false;
    boolean isClinetCode = false;
    boolean isDemat = false;
    boolean isDpId = false;
    boolean isValid = false;

    public boolean valid(Register register) {
        this.register=register;
        if (register.getName() != null) {
            isName = true;
        } else {
            System.out.println("Given Name is Invalid");
        }
        if (register.getNomineesName() != null&& !register.getNomineesName().isEmpty()) {
            isNominee = true;
        } else {
            System.out.println("Nominee name Invalid");
        }

        if(register.getClientCode()!=0&& String.valueOf(register.getClientCode()).length()==16){
            isClinetCode=true;
        }else{
            System.out.println("clinet code is Invalid ");
        }
        if(register.getDematNumber()!=0&& String.valueOf(register.getDematNumber()).length()==10){
            isDemat=true;
        }else{
            System.out.println("Demat account number Invalid");
        }
        if(register.getDpId()!=0&& String.valueOf(register.getDpId()).length()==8){
            isDpId=true;

        }
        else{
            System.out.println("Depository paticipent number is Invalid ");
        }
        if(isName&&isNominee&&isClinetCode&&isDemat&&isDpId){
            isValid=true;
        }else{
            System.out.println("Please give Input as correct format");
        }
        return  isValid;
    }
    public  void getInfo(){
        System.out.println("The Name: "+register.getName());
        System.out.println("Nominee Name: "+register.getNomineesName());
        System.out.println("Clinet code: "+register.getClientCode());
        System.out.println("Demat Account Number: "+register.getDematNumber());
        System.out.println("DP Account number: "+register.getDpId());
    }





}
