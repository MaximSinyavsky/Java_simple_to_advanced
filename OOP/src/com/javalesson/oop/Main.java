package com.javalesson.oop;

public class Main {
    public static void main(String[] args) {
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

        Dog sheppard = new Dog();
        sheppard.setPaws(5);
        sheppard.setName("Rex");
        sheppard.setBreed("sheppard");
        sheppard.setTail(2);

        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Sheppard's " + sheppard.getPaws() + " paws");
        // STOPSHIP: 06.07.2022 lesson 16;
    }
}
