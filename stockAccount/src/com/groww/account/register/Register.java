package com.groww.account.register;

public class Register {
    private String name;
    private  String nomineesName;
    private long clientCode;
    private  long dematNumber;
    private  long dpId;

    public String getName(){
        return name;
    }
    public  void setName(String name){
        this.name=name;

    }

    public String getNomineesName(){
        return  nomineesName;
    }
    public  void setNomineesName(String nomineesName){
        this.nomineesName=nomineesName;
    }
    public long getClientCode(){
        return  clientCode;
    }
    public  void setClientCode(long clientCode){
        this.clientCode=clientCode;
    }
    public long getDematNumber(){
        return dematNumber;
    }
    public  void setDematNumber(long dematNumber){
        this.dematNumber=dematNumber;
    }
    public long getDpId(){
        return dpId;
    }
    public void setDpId(long dpId){
        this.dpId=dpId;
    }







}
