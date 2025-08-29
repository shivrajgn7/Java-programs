package com.facebook.login;

import com.facebook.login.password.Password;

public class LoginRunner {
    public static void main(String[] args) {
        Password pas=new Password();
        pas.setPass(45);
        pas.setUser("usere#df");
        System.out.println("user"+ pas.getUser());
        System.out.println("password"+pas.getPass());
    }
}
