package com.xworkx.calculator;

public class CalculatorRunner {
    public static void main(String[] args) {

        System.out.println("Main Started");
        ScientificHospital scientificHospital=new ScientificHospital();
        scientificHospital.setScName("shsh");
        System.out.println("Set id: "+scientificHospital.getScName());

        scientificHospital.add(45,65);
        scientificHospital.sub(34,12);
        scientificHospital.mul(10,25);

        scientificHospital.div(67,43);
        scientificHospital.mod(56,76);
        scientificHospital.sin();
        scientificHospital.cos();
        scientificHospital.tan();
        scientificHospital.exponential(3,2);

        System.out.println("Main Ended   ");
    }
}
