package com.xworkz.deviceapp.phone;

import com.xworkz.deviceapp.device.Device;

public class Phone extends Device {
    public Phone(){
        super();
        System.out.println("Phone cons is invoked");
    }
    @Override
    public void isInternetSupport(){
        System.out.println("phone support internet");
    }
}
