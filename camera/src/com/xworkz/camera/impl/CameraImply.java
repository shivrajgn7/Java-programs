package com.xworkz.camera.impl;

import com.xworkz.camera.Camera;

public class CameraImply implements Camera {
    public void cameraCmp(){
        System.out.println("Nikon");

    }
    public int blur(int val){
        if(val>14)
            System.out.println("deep blur "+val);
        else
            System.out.println("less blur "+val);
    return val;
    }

    public boolean isGood(){
        return true ;
    }
}
