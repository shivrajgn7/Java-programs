package com.xworkz.polymorphism.sounds;

import com.xworkz.polymorphism.AnimalSounds;

public class AnimalMain {
    public static void main(String[] args) {
        AnimalSounds animal=new AnimalSounds();
        Cow cow=new Cow();

        animal.sound();
        cow.sound();
    }
}
