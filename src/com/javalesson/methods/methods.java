package com.javalesson.methods;

public class methods {
    public static void main(String[] args) {
        printMassage("Alex");
//        printMassage("Maxim");
//        printMassage("Oleg");
        System.out.println("Rectangle Square = " + calcRectangleSquare(5, 10));
        System.out.println("Square = " + calcSquare(10));
        //int sumOfSquares = calcSquare(b) +calcRectangleSquare(5, 10);
        //System.out.println("sum Of Squares = "+sumOfSquares);
        System.out.println("sum Of Squares = " + (calcSquare(10) + calcRectangleSquare(5, 10)));
        String str1 = "i love coffe";
        str1.toUpperCase();
        // STOPSHIP: 23.06.2022  


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
