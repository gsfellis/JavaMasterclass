package com.gsfellis;

public class Main {

    public static void main(String[] args) {

        // If statement
        System.out.println("### IF STATEMENT ###");

        int value = 3;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if ( value == 2) {
            System.out.println("Vaue was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        // Switch
        System.out.println("\n### SWITCH STATEMENT ###");
        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3, 4, or 5");
                System.out.println("The value was: " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Switch challenge
        // Create a new switch statement using char instead of int
        // create a new char variable
        // create a switch statement testing for
        // A, B, C, D, or E
        // display a message if any of these are found and then break;
        // add a default which displays a message saying not found

        char charValue = 'c';

        switch (charValue) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Found: " + charValue);
                break;
            default:
                System.out.println("A, B, C, D, E - Not found");
                break;
        }

        // String switch
        String month = "January";

        switch(month.toLowerCase()) { // test for lower to reduce cases
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
