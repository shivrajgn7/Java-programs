package com.xworkz.pgrunner.pg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
public class PG {
    private int pgId;
    private String pgName;
    private int noOfRooms;
   private double price;
   public PG( int pgId, String pgName,int noOfRooms,double price){
       this. pgId=pgId;
       this. pgName=pgName;
       this.noOfRooms=noOfRooms;
       this. price=price;

   }


}
