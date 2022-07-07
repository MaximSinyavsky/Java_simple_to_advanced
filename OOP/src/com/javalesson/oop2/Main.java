package com.javalesson.oop2;

import com.javalesson.oop.Dog;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dog's count " + Dog.getDogsCount());

        Dog lab = new Dog();
//        dog.paws = 4;
//        dog.tail = 1;
//        dog.name = "Tyson";
//        dog.breed = "lab";
        // STOPSHIP: 06.07.2022
        lab.setPaws(4);
        lab.setTail(1);
        lab.setName("Tyson");
        lab.setBreed("lab");
        lab.setSize("Average");
        //lab.bark();
        lab.bite();

        Dog sheppard = new Dog();
        sheppard.setPaws(4);
        sheppard.setName("Rex");
        sheppard.setBreed("sheppard");
        sheppard.setTail(1);
        sheppard.setSize("BIG");
        //sheppard.bark();
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setSize("Big");
        doberman.setName("Baddy");
        doberman.setTail(1);
        doberman.setPaws(4);
        doberman.setBreed("doberman");
        doberman.bite();

//        System.out.println(doberman.getSize());

        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Sheppard's " + sheppard.getPaws() + " paws");
        // STOPSHIP: 06.07.2022 lesson 16;

    }
}
// STOPSHIP: 06.07.2022 lesson 17;
