package com.javalesson.controlstatement;

public class whileDo {
    public static void main(String[] args) {
        int finalBalance = 100_000;
        double currentBalace = 0;
        int payment = 10_00;
        int years = 0;
        double interestRate = 0.1;
//        while (currentBalace < finalBalance) {
//            currentBalace += payment;
//            currentBalace = currentBalace + currentBalace * interestRate;
//            years++;
//            System.out.println("Year " + years + " " + currentBalace);
//        }
// Неопределенный цикл:
        do {
            currentBalace += payment;
            currentBalace = currentBalace + currentBalace * interestRate;
            years++;
            System.out.println("Year " + years + " " + currentBalace);
        } while (currentBalace < finalBalance && years < 15);

    }
}
