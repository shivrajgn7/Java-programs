package com.karnataka.karOne.log;

public class LogIn {
    private String fullName;
    private String secName;
    private String gmail;
    private long mblNumber;
    private String loginId;
    private String password;
    private String confirmPassword;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public String getGmail() {
        return gmail;
    }
    public void setGmail(String gmail){
        this.gmail=gmail;
    }

    public long getMblNumber() {
        return mblNumber;
    }
    public void setMblNumber(long mblNumber){
        this.mblNumber=mblNumber;
    }
    public String getLoginId(){
        return  loginId;
    }
    public  void setLoginId(String loginId){
        this.loginId=loginId;
    }
    public String getPassword(){
        return  password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }
    public void setConfirmPassword(String confirmPassword){
        this.confirmPassword=confirmPassword;
    }
}

