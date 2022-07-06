package com.javalesson.controlstatement;

public class controls {
    public static void main(String[] args) {
        int i = 10;
        {
            int k = 15;
            System.out.println("i =" + i);
            System.out.println("k =" + k);
        }
        int testScore = 80;
        System.out.println("You have got");
        if (testScore > 90) {
            System.out.println("an Excellent");
        } else if (testScore >= 75) {
            System.out.println("a good ");
        } else if (testScore >= 60) {
            System.out.println("a satisfactory");
        } else {
            System.out.println("a bad ");
        }
        System.out.println("mark");
        //код повторяться не должен
        //вызываться можеть сколько угодно раз, но написан только один раз

    }
}