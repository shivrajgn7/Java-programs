package com.gov.passport;

import com.gov.passport.reg.PassportRegister;
import com.gov.passport.seva.PassportSeva;
import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class PassportRunner {
    public static void main(String[] args) {
        PassportRegister reg=new PassportRegister();

        reg.setPassportOffice(null);
        System.out.println("Passport Office: "+reg.getPassportOffice());

        reg.setGivenName(null);
        System.out.println("Give Name: "+reg.getGivenName());

        reg.setSurName("G N");
        System.out.println("SurName: "+reg.getSurName());

        reg.setDob(null);
        System.out.println("Date of birth: "+reg.getDob());

        reg.setEmail(null);
        System.out.println("Email: "+reg.getEmail());


        reg.setSameAsEmailId(false );
        System.out.println("is email id same : "+reg.getSameAsEmailId());

        reg.setLogin(null);
        System.out.println("Login id: "+reg.getLogin());


        reg.setPassword(null);
        System.out.println("Password: "+reg.getPassword());

        reg.setRegister(false);
        System.out.println("not a registered: "+reg.getIsRegister());

        
        PassportSeva seva=new PassportSeva();
            seva.userRegistered(reg);
    }
}
