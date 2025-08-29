package com.amazon.register.validation;

import com.amazon.register.register.Register;

public class Validation {
    Register register;
    public boolean val(Register register) {
        this.register = register;
        boolean isValid = false;
        boolean isFirstName = false;
        boolean isSecName = false;
        boolean isPassword = false;
        boolean isConfirmPassword = false;
        if (register.getFirstName() != null) {
            isFirstName = true;

        } else {
            System.out.println("First name not valid");
        }
        if (register.getSecName() != null) {
            isSecName = true;
        } else {
            System.out.println("Sec name not valid");
        }
        if (register.getPassword() != null) {
            isPassword = true;
        } else {
            System.out.println("Password is  invalid");
        }
        if (register.getConPassword() != null && register.getPassword().equals(register.getConPassword())) {
            isConfirmPassword = true;
        } else {
            System.out.println("Conform password is incorrect");
        }
        if (isFirstName && isSecName && isPassword && isConfirmPassword) {
            isValid = true;
            System.out.println("Register Successful");
        } else {
            System.out.println("Please fill all the values");
        }
        return isValid;
    }

        public void getInfo () {
            if(register!=null) {

                System.out.println("First name: " + register.getFirstName());
                System.out.println("Sec name: " + register.getSecName());
                System.out.println("Password: " + register.getPassword());
                System.out.println("Confirm password: " + register.getConPassword());
            }else System.out.println("ot registered");
        }

}
