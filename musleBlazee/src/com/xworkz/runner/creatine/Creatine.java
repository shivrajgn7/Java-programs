package com.xworkz.runner.creatine;

public class Creatine {

    private int creatineId;
    private  String name;
    private String flavore;
    private  int grams;
    private  double price;
    private boolean isgood;

    public  Creatine(int creatineId,String  name,String flavore,int grams,double price,boolean isgood){
       this.creatineId=creatineId;
       this.name=name;
       this.flavore=flavore;
       this.grams=grams;
       this.grams=grams;
       this.price=price;
       this.isgood=isgood;

    }
    public String toString(){
        return creatineId+":"+name+":"+flavore+":"+grams+":"+price+":"+isgood;
    }
}
