package com.karnataka.karOne.validation;
import com.karnataka.karOne.log.LogIn;
public class Validation {
    LogIn login;

   public  void validate(LogIn login){
       boolean isValid=false;
       boolean isFullName=false;
       boolean isSecName=false;
       boolean isEmail=false;
       boolean isMblNumber=false;
       boolean isLoginId=false;
       boolean isPassword=false;
       boolean isConfirmPassword=false;

       if(login.getFullName()!=null) {
           isFullName = true;
       }else{
           System.out.println("give correct given name");
       }
       if(login.getSecName()!=null) {
           isSecName = true;

       }else{
           System.out.println("Secounf name is invalid");
       }
       if(login.getGmail()!=null){
            isEmail=true;

       }else{
           System.out.println("Email name is invalid");
       }
       if(login.getMblNumber()!=0){
           isMblNumber=true;

       }else{
           System.out.println("Mobile number is Invalid");
       }
       if(login.getLoginId()!=null){
           isLoginId=true;
       }else{
           System.out.println("Login Id is invalid");
       }
       if(login.getPassword()!=null){
          isPassword=true;
           if(login.getConfirmPassword()!=null&&login.getPassword().equals(login.getConfirmPassword())){
               isConfirmPassword=true;

       }else{
           System.out.println("Invalid password give same as password");
       }


       }else{
           System.out.println("Invalid confirm Password");
       }
       if(isLoginId&&isMblNumber&&isEmail&&isSecName&&isFullName) {

           if(isConfirmPassword==isPassword) {
             this.login=login;
               isValid=true;
               System.out.println("User register Successful");
           }
       }
       else{
           System.out.println("Please fill Correct formate");
       }


   }
}
