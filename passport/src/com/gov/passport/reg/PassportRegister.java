package com.gov.passport.reg;

public class PassportRegister {
    private String passportOffice ;
    private String givenName;
    private String surName;
    private String dob;
    private String email;
    private boolean sameAsEmailId;
    private String login;
    private String password;
    private boolean isRegister;

    public String getPassportOffice(){
        return passportOffice;
    }
    public void setPassportOffice(String passportOffice){
        this.passportOffice=passportOffice;
    }

    public String getGivenName(){
        return givenName;
    }
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }
    public String getDob(){
        return dob;
    }

    public void setDob(String dob){
        this.dob=dob;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public boolean getSameAsEmailId(){
        return sameAsEmailId;
    }
    public void setSameAsEmailId(boolean sameAsEmailId){
        this.sameAsEmailId=sameAsEmailId;
    }

    public String getLogin(){
        return login;
    }
    public void setLogin(String login){
        this.login=login;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public boolean getIsRegister(){
        return isRegister;
    }
    public void setRegister(boolean isRegister){
        this.isRegister=isRegister;
    }

}
