package com.puppy.notificationapp.implclasses;

import com.puppy.notificationapp.interfaces.Notification;

public class SMS implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Notification:you have one msg");
    }
}
