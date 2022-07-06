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
        String str1 = "I like black coffee";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        // STOPSHIP: 23.06.2022
        String str2 = "I like coffee";
        String str3 = "I like coffee!!!";
        String substring = str3.substring(0, 13);
        System.out.println("substring = " + substring);
        String str4 = new String("i like coffee");
        boolean b = str2 == str4;
        //System.out.println(b);
        boolean c = str4.equals(str4);
        //System.out.println(c);
        boolean like = str1.startsWith(" like", 1);
        System.out.println(like);
        boolean like2 = str2.endsWith("fee");
        System.out.println(like2);
        System.out.println(str1.replace("black","white"));
        System.out.println(str3.indexOf("!!!"));
        // STOPSHIP: 06.07.2022  

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
