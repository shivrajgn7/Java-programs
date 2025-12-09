package com.xworkz.runner;

import java.util.*;

public class Runner {
    public static void main(String[] args) {

      /*  int i[] = new int[6];

        i[0] = 90;
        */


        Collection bangaloreCentral = new ArrayList();
    bangaloreCentral.add("Majestic");
bangaloreCentral.re
        Collection bangaloreRegion = new ArrayList();
        bangaloreRegion.addAll(bangaloreCentral);

        bangaloreRegion.cont()




        Collection collection1 = new
        System.out.println("Bangloor area names: "+collection);

        // System.out.printf(collection);


        Collection omSongs = new TreeSet();
        omSongs.add("college kumaru");
        omSongs.add("college kumaru");
      //  omSongs.add("Hey Dinakara");
        omSongs.add("Mehabooba");


       boolean isAvailable =  omSongs.contains("Hey Dinakara");
        System.out.println(isAvailable);

        System.out.println("OM Movie Songs: "+omSongs);

        Collection kantaraSongs=new TreeSet();
        kantaraSongs.add("Brahmakaasha");
        kantaraSongs.add("Varaha Roopam");
        kantaraSongs.add("Singara seriye");


        kantaraSongs.remove("Varaha Roopam");
        System.out.println("Kantara Songs: "+kantaraSongs);

        Collection<String> bagheeraSongs=new ArrayList<String>();
        bagheeraSongs.add("Parichayavadha");
        bagheeraSongs.add("Rudheera Dhara");
        bagheeraSongs.add("Shiva Stootra");
        System.out.println("Bagheera Songs: "+bagheeraSongs);

        Collection<String> mungarumaleSongs=new ArrayList<String>();
        mungarumaleSongs.add("Ondhe ondhu sari");
        mungarumaleSongs.add("Mungaru maleye");
        mungarumaleSongs.add("Kundhu kunidhu baare");
       // System.out.println();
        System.out.println("Mungarumale songs: "+mungarumaleSongs);

        Collection<String> kgfSongs=new ArrayList<String >();
        kgfSongs.add("Garbadhi");
        kgfSongs.add("Sidila Bharava");
        kgfSongs.add("Salam Rocky Bhai");
        System.out.println("KGF Songs: " +
                ""+kgfSongs);

    }

}
