package com.gsfellis;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
        // will run at least once (infinite loop scenario)
//	    count = 6;
//	    do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 6);

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        number = 4;
        finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue;
            }
            count++;
            System.out.println("Even number " + number);

            if (count == 5) {
                break;
            }
        }

        System.out.println("Found " + count + " even numbers.");
    }

    // create a method called isEvenNumber that takes a paremeter of type int
    // its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number otherwise return false

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
