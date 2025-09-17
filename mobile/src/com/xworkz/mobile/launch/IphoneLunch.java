package com.xworkz.mobile.launch;

import com.xworkz.mobile.iphone.Iphone;

public class IphoneLunch {
    Iphone iphone;

    public boolean isLunched(Iphone iphone) {
        boolean isLuch = false;
        if (this.iphone.isAllDone()){
            System.out.println("All are ready to launch");
        if (this.iphone.noOfLaunch() <= 12000) {
            System.out.println("you can launch");
            isLuch = true;
        }
    }else{
            System.out.println("You can't launch this much of mobile");
        }
       return isLuch;
    }
}
