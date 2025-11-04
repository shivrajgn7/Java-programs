package com.xworkx.ex.propogation;

public class ExceptionPropogation {
    public static void main(String[] args)  throws  ClassNotFoundException {
        ExceptionPropogation ex=new ExceptionPropogation();
        System.out.println("Main started");
        ex.method1();

        System.out.println("Main ended");
        Object

    }
        public   void method1() throws  ClassNotFoundException{

        method2();
            System.out.println("method 1");

        }
        public  void method2() throws ClassNotFoundException{
            System.out.println("Method 2");
        Class.forName("com.xworkx.ex.CheckedException");

        }
    }

