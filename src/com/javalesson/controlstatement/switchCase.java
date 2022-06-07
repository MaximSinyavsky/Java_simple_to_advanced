package com.javalesson.controlstatement;

public class switchCase {
    public static void main(String[] args) {
        String dayOfTheWeek = args[0];
        switch (dayOfTheWeek.toLowerCase()) {
            case "monday":
                System.out.println("this is first working day");
                break;
            case "tuesday":
                System.out.println("this is second working day");
                break;
            case "wednesday":
                System.out.println("this is thirst working day");
                break;
            case "thursday":
                System.out.println("this is fourth working day");
                break;
            case "friday":
                System.out.println("this is fifth working day");
                break;
            case "saturday": case "sunday":
                System.out.println("finally weekend");
                break;
            default:
                System.out.println("not a day of the week");
        }
    }
}
