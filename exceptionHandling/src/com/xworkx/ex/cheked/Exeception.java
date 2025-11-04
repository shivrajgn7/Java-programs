package com.xworkx.ex.cheked;

public class Exeception {
    public static void main(String[] args) {
        System.out.println("Main started");
        try {
            String st = null;
            System.out.println(st.length());
        } catch (NullPointerException nu) {
            System.out.println("we do not access null :" + nu);
        }

        System.out.println("Main endded");
    }
}
