package com.gsfellis;

public class Main {

    public static void main(String[] args) {
        System.out.println("### BASE ###");

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));



        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2 - 8
        // and print teh result to the console window.
        System.out.println("\n### FOR LOOP 1 ###");

        double amount = 10000.0;

        for (int i = 2; i < 9; i++) {
            System.out.println(amount + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        System.out.println("\n### FOR LOOP 2 ###");

        for (int i = 8; i > 1; i--) {
            System.out.println(amount + " at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        // Create a for statement using any range of numbers
        // determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint: use the break; statement to exit
        int count = 0;

        for (int i = 10000; i < 999999999; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime");
                count++;
            }

            if (count >= 100) {
                break;
            }
        }


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        // base:
        // for (int i = 2; i <= n/2; i++) {
        // optimized:
        for (int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
