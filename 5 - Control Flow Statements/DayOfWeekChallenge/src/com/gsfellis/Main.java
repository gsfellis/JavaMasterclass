package com.gsfellis;

public class Main {

    public static void main(String[] args) {

//        Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
//
//                The method should not return any value (hint: void)
//
//        Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh if the int parameter gdayh is 0, 1, c , 6 respectively, otherwise it should print gInvalid dayh.
//
//        Bonus:
//        Write a second solution using if then else, instead of using switch.
//        Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh

        System.out.println("### SWITCH ###");
        for (int i = -1; i < 8; i++) {
            printDayOfTheWeek(i);
        }

        System.out.println("\n### IF ###");
        for (int i = -1; i < 8; i++) {
            printDayOfTheWeekIfStatement(i);
        }
    }

    private static void printDayOfTheWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    private static void printDayOfTheWeekIfStatement(int dayOfWeek) {
        if (dayOfWeek == 0) {
            System.out.println("Sunday");
        } else if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
