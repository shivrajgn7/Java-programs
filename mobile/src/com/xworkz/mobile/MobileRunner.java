package com.xworkz.mobile;

import com.xworkz.mobile.imply.IphoneImply;
import com.xworkz.mobile.iphone.Iphone;
import com.xworkz.mobile.launch.IphoneLunch;

public class MobileRunner {
    public static void main(String[] args) {
        Iphone iphoneImply=new IphoneImply();
        iphoneImply.seris();
        iphoneImply.noOfLaunch(5660);
        iphoneImply.isAllDone(true);
        IphoneLunch iphoneLunch=new IphoneLunch();
        iphoneLunch.isLunched(iphoneImply);
    }
}
