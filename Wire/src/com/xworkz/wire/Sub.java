package com.xworkz.wire;

public class Sub {
    int subId;
    String subName;
    Sub(int subId,String subName){
        this.subId=subId;
        this.subName=subName;
    }

    void getSub(){
        System.out.println("Sub id is: "+subId);
        System.out.println("Sub Name is: "+subName);
    }
}
