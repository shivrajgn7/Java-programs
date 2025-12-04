package com.puppy.smartphoneapp;

import com.puppy.smartphoneapp.classes.Smartphone;

public class Runner {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        smartphone.clickPhoto();
        smartphone.playMusic();
        smartphone.recordVideo();
        smartphone.stopMusic();
    }
}
