package com.javalesson.methods;

public class methods {
    public static void main(String[] args) {
        printMassage("Alex");
//        printMassage("Maxim");
//        printMassage("Oleg");
        int a = 5;
        int b = 10;
        System.out.println("Rectangle Square = " + calcRectangleSquare(a, b));
        System.out.println("Square = " + calcSquare(b));
        //int sumOfSquares = calcSquare(b) +calcRectangleSquare(a, b);
        //System.out.println("sum Of Squares = "+sumOfSquares);
        System.out.println("sum Of Squares = " + (calcSquare(b) + calcRectangleSquare(a, b)));

    }

    static void printMassage(String name) {

        System.out.println("hello " + name + "!!!");
    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        //System.out.println("rectangleSquare = " + square);
        return square;
    }

    static int calcSquare(int x) {
        return x * x;

    }

}
