package com.puppy.notificationapp.implclasses;

import com.puppy.notificationapp.interfaces.Notification;

public class Email implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("You have one mail");
    }
}
