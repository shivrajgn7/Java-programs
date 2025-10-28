package com.amazon.register.register;
import com.amazon.register.validation.Validation;

public class RegisterDto {
    private String firstName;
    private String secName;
    private String password;
    private String conPassword;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getSecName(){
        return secName;
    }
    public void setSecName(String secName){
        this.secName=secName;
    }
    public  String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getConPassword(){
        return conPassword;
    }
    public void setConPassword(String conPassword){
        this.conPassword=conPassword;
    }





}
