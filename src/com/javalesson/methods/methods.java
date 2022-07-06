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

        String str1 = "i love coffee";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        // STOPSHIP: 23.06.2022
        String str2 = "i love coffee";
        String str3 = "i love coffee!!!";
        str3.substring(0,13);
        boolean b = str2 == str1;
        System.out.println(b);
        System.out.println(str3.substring(0,13));

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
