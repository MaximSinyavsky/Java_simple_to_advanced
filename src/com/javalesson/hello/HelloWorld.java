package com.javalesson.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        byte b = 10;
        int a = b + 23;
        short c = 200; //2^16
        long myLongValue = 123_456_789_876L;
        float myFloatValue = 23.56F;
        double myDoubleValue = 56.45D;

        double sum = a + b + c + myLongValue + myDoubleValue + myFloatValue;
        float floatResult = myFloatValue / 3;
        double myNewDouble = 23.56;

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';
        char char5 = '\u00B6'; //Добавление символов из unicod таблицы

        boolean b1 = true;
        boolean b2 = false;
        String s = "some string"+" some other string";
        System.out.println(s);

        System.out.println("floatResult = " + floatResult);
        System.out.println("myDoubleResult = " + myNewDouble / 3);
        System.out.println("Charecters:");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);
        System.out.println("Sum of charecters:");
        System.out.println(char1 + char2 + char3 + char4 + char5);
        System.out.println("char: " + char1 + char2 + char3 + char4 + char5);
    }
};