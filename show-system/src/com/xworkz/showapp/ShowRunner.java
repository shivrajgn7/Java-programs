package com.xworkz.showapp;

import com.xworkz.showapp.podcast.Podcast;
import com.xworkz.showapp.show.Show;

public class ShowRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Show show1 = new Podcast();
        show1.toDoShow();
        System.out.println("main ended");

    }
}
