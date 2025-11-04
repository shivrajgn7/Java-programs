package com.xwrokz.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileException {
    public static void main(String[] args) {


        File file = new File("mnc.txt");
        try {
            file.createNewFile();
            System.out.println("file is created");
        }catch (IOException i){
            System.out.println("an erro accoured");
            i.printStackTrace();
        }
    //writing file:
        try {
            FileWriter fileWriter = new FileWriter("mnc.txt");
            fileWriter.write("shivraj hi!!!!!\n");
            fileWriter.write("okay bye..!");
            fileWriter.close();
            System.out.println("successfuly writen");
        }catch (IOException e){
            e.printStackTrace();
        }
//reading file
        try{
            Scanner sc=new Scanner(file  );
            while(sc.hasNextLine()){
                String line=sc.next();
                System.out.println(line);
            }
            sc.close();
        }catch (Exception m){
            m.printStackTrace();
        }




    }
}
