package com.xworkz.deviceapp;

import com.xworkz.deviceapp.device.Device;
import com.xworkz.deviceapp.phone.Phone;

public class DeviceRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Device device = new Phone();
        device.isInternetSupport();
        System.out.println("main ended");

    }
}
