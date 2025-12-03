package com.puppy.smartphoneapp.classes;

import com.puppy.smartphoneapp.interfaces.Camera;
import com.puppy.smartphoneapp.interfaces.MusicPlayer;

public class Smartphone implements Camera, MusicPlayer {
    @Override
    public void clickPhoto() {
        System.out.println("Clicking photo");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording videos");

    }

    @Override
    public void playMusic() {
        System.out.println("Playing musing");

    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");

    }
}
