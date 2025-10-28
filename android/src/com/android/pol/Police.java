package com.android.pol;

public class PoliceDto {
    private int policeId;
    private String place;
    private boolean isStation;

    public int getPoliceId(){
        return policeId;
    }
    public String getPlace(){
        return place;
    }
    public boolean getIsStation(){
        return isStation;
    }
    public void setPoliceId(int policeId,String place,boolean isStation){
        this.policeId=policeId;
        this.place=place;
        this.isStation=isStation;

        System.out.println("police id is:"+policeId);
    }

    public void getInfo(){
        System.out.println("Police Information");
        System.out.println("Police id= "+policeId);
    }

}
