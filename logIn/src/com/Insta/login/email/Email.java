package com.Insta.login.email;

public class Email {
    private int pas;
    private  String user;

    public int getPas(){
        return  pas;
    }

    public String getUser(){
        return user;
    }

    public  void setEmail(int pas,String user){
        this.pas=pas;
        this.user=user;
    }
    /*public void isValid(){
        int pasValid;
        String userValid;
        if(userValid==user){
            if(pasValid==pas){
                System.out.println("Login succesful");
            }
            else
                System.out.println("not valid username and password");
        }
    }*/

}
