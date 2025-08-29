package com.xworkz.showapp.podcast;

import com.xworkz.showapp.show.Show;

public class Podcast extends Show {
    public Podcast(){
        super();
        System.out.println("Podcast cons is invoked");
    }
    @Override
    public void toDoShow(){
        System.out.println("to do Interview");
    }
}
