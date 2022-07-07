package com.javalesson.oop;

public class Dog {
    private static int dogsCount;

    private int paws;
    private int tail;
    private String name;
    private String breed;
    private String size;

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    // STOPSHIP: 06.07.2022

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (size.equalsIgnoreCase("big") || size.equalsIgnoreCase("average") || size.equalsIgnoreCase("small")) {
            this.size = size;
        } else {
            System.out.println("Size should be one of these: Big, Average or Small");
        }

    }

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
    public void bark() {
        if (size.equalsIgnoreCase("Big")) {
            System.out.println("Wof-Wof");
        } else if (size.equalsIgnoreCase("Average")) {
            System.out.println("Raf-Raf");
        } else {
            System.out.println("Tyf-Tyf");
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting you");
        } else {
            bark();
        }
    }
}
// STOPSHIP: 06.07.2022 lesson 17;
