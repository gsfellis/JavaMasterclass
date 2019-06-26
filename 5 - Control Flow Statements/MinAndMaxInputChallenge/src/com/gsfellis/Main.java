package com.gsfellis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//-Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//-Before the user enters the number, print the message gEnter number:h
//-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//Hint:
//-Use an endless while loop.
//
//        Bonus:
//-Create a project with the name MinAndMaxInputChallenge.

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(true) {
            System.out.print("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number < min) {
                    min = number;
                }

                if (number > max) {
                    max = number;
                }

            } else {
                System.out.println("min = " + min);
                System.out.println("max = " + max);
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
