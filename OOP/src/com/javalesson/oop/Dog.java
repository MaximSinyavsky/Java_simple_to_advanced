package com.javalesson.oop;

public class Dog {
    private int paws;
    private int tail;
    private String name;
    private String breed;

    // STOPSHIP: 06.07.2022

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPaws() {
        return paws;
    }

    public void setPaws(int paws) {
        if (paws == 4) {
            this.paws = paws;
        } else {
            this.paws = 4;
            System.out.println("User tried to assign " + paws + " paws");
            System.out.println("Correct number is four");
        }
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        if (tail == 1) {
            this.tail = tail;
        } else {
            this.tail = 1;
            System.out.println("User tried to assign " + tail + " tail");
            System.out.println("Correct number is one");
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    // STOPSHIP: 06.07.2022 lesson 16;
}
