package com.xworkx.ex;

public class CheckedException {
    public static void main(String[] args) {
        System.out.println("main started");
        try {
            Class.forName("com.xworkx.ex.CheckedEception");
            System.out.println("object instantiated");
        }catch (ClassNotFoundException e){
            e.printStackTrace();

            System.out.println("Class is not available"+e);
        }
        System.out.println("Main ended..");
    }

}
