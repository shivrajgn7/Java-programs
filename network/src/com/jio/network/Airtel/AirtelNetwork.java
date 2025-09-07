package com.jio.network.Airtel;

public class AirtelNetwork {

    int netId;
    String cmpName;

    public AirtelNetwork(int netId,String cmpName){
        this.netId=netId;
        this.cmpName=cmpName;
    }
    public void getInfo(){
        System.out.println("Network Id:"+netId);
        System.out.println("Cmp name:"+cmpName);
    }


}
