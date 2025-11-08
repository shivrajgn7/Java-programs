package com.xworkz.runner.creatine;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Creatine implements Comparable<Creatine>{

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

    @Override
    public int compareTo(Creatine o) {
        return this.creatineId-o.creatineId;
    }
    // public String toString(){
       // return creatineId+":"+name+":"+flavore+":"+grams+":"+price+":"+isgood;
   // }



//    @Override
//    public int compareTo(Creatine o) {
//        return this.creatineId- o.creatineId;
//    }

}
