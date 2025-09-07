package com.jio.network;

import com.jio.network.Airtel.AirtelNetwork;
import com.jio.network.Idea.ViRunner;

public class NetworkRunner {
    public static void main(String[] args) {
        System.out.println("Main Started");
        AirtelNetwork airtel=new AirtelNetwork(45,"Airtel");
        airtel.getInfo();

        ViRunner vi=new ViRunner();
        vi.viId=23;
        System.out.println("VI id :"+vi.viId);
        System.out.println("Main Ended");
    }
}
