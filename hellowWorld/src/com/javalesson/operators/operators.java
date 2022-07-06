package com.javalesson.operators;

public class operators {
    public static void main(String[] args) {

        double a = 10;
        double b = 3;
        double c = a + b;

        double d = a - b;
        double e = a * b;
        double f = a / b;
        double g = a % b; //остаток от деления

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);
// Инкреминтирование
//        a = a + 5;
        a = +5;
        System.out.println("newA = " + a);

        a++;
        System.out.println("newA = " + a);
// Декреминтация
        --b;
        System.out.println("newB = " + b);

        double n = 7;
        double m = 7;
        double result1 = 2 * n++;
        double result2 = 2 * ++m;
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        int x = 3;
        int y = 5;
        int z = 8;
        boolean boolValue = x != y;
        System.out.println("boolValue = " + boolValue);
        boolean boolValue2 = y > z;
        System.out.println("boolValue2 = " + boolValue2);
        boolean resultBoolean = boolValue2 || boolValue;
        System.out.println("resultBoolean = " + resultBoolean);

        //Тенарный оператор:
        int res = x < y ? x : y;
        System.out.println("tenarny res =" + res);

        System.out.println("NOT = " + !(x > y));
    }
}