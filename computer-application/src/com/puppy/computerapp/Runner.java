package com.puppy.computerapp;

import com.puppy.computerapp.contract.Computer;
import com.puppy.computerapp.implclasses.Desktop;

public class Runner {
    public static void main(String[] args) {
        Computer comp = new Desktop();
        comp.staticComputer();
        comp.mobileCoputer();
        comp.applicationComp();
    }
}
