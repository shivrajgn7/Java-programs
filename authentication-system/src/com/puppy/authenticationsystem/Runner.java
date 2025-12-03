package com.puppy.authenticationsystem;

import com.puppy.authenticationsystem.Interfaces.Autenticate;
import com.puppy.authenticationsystem.implclasses.UserAuthentication;

public class Runner {
    public static void main(String[] args) {
        Autenticate auth = new UserAuthentication();
        auth.isNameAuth();
        auth.isAgeAuth();
        auth.isLocationAuth();
    }
}
