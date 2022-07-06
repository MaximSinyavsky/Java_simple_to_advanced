package com.javalesson.controlstatement;

public class forLoop {
    public static void main(String[] args) {
        int factorialLimit = 10;
        int factorial = 1;
        for (int i = 1; i < factorialLimit; i++) {
            factorial *= i;
            System.out.println("factorial =" + factorial);
        }
        System.out.println("final factorial value =" + factorial);
//        for (int i = 10; i >= 0; i--) {
//            System.out.println("I= " + i);
//        }
        int i = 10;
        while (i >= 1) {
            System.out.println("i=" + i);
            i--;
        }
    }
}
