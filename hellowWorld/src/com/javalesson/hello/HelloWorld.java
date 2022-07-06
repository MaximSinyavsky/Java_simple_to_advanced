package com.javalesson.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //Примитивные типы данных:
        //Переменные в Java.
        byte b = 10;
        int a = b + 23;
        short c = 200; //2^16
        long myLongValue = 123_456_789_876_543_123_2L;

        float myFloatValue = 23.56F;
        double myDoubleValue = 56.45D;

        double sum = a + b + c + myLongValue + myDoubleValue + myFloatValue;
        System.out.println("sum = " + sum);
        float floatResult = myFloatValue / 3;
        System.out.println("floatResult = " + floatResult);
        double myNewDouble = 23.56;
        System.out.println("myDoubleResult = " + myNewDouble / 3);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';
        char char5 = '\u00B6'; //Добавление символов из unicod таблицы
        System.out.println("Charecters:");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);
        System.out.println("char4 = " + char4);
        System.out.println("char5 = " + char5);
        System.out.println("Sum of charecters:");
        System.out.println(char1 + char2 + char3 + char4 + char5);
        System.out.println("char: " + char1 + char2 + char3 + char4 + char5);

        boolean b1 = true;
        boolean b2 = false;
        String s = "some string" + " some other string";
        System.out.println(s);


        //Приведение типов данных:
        short someShort = b;
        System.out.println("someShort = " + someShort);
        int someInt = someShort;
        System.out.println("someInt = " + someInt);
        someShort = (short) someInt;
        System.out.println("someShort = " + someShort);
        someInt = (int) myLongValue;
        System.out.println("myLongValue = " + myLongValue);
        System.out.println("someInt = " + someInt);

        double someDouble = myFloatValue;
        System.out.println("someDouble = " + someDouble);

        double someIntToDouble = someInt;
        System.out.println("someIntToDouble" + someIntToDouble);

        double someLongToDouble = myLongValue;
        System.out.println("someLongToDouble = " + someLongToDouble);

        long someDoubleToLong = (long) someLongToDouble;
        System.out.println("someDoubleToLong = " + someDoubleToLong);
    }
};