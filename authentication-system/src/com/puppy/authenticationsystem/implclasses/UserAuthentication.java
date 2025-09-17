package com.puppy.authenticationsystem.implclasses;

import com.puppy.authenticationsystem.Interfaces.Autenticate;

public class UserAuthentication implements Autenticate {
    @Override
    public boolean isNameAuth() {
        return true;
    }

    @Override
    public boolean isAgeAuth() {
        return true;
    }

    @Override
    public boolean isLocationAuth() {
        return true;
    }
}
