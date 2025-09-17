package com.xworkz.camera;

import com.xworkz.camera.impl.CameraImply;

public class CameraRunner {
    public static void main(String[] args) {
        CameraImply cameraImply=new CameraImply();
        System.out.println(  cameraImply.blur(12));
        cameraImply.cameraCmp();
        System.out.println( cameraImply.isGood());
    }
}
