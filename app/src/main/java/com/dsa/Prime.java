package com.dsa;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A prime is a number that is not divisible by any number exept 1 and itself
 * without leaving a reminder
 * 
 * The time complexity analysis
 * Worst case:
 * - The prime status terminates when value of loop variable exceeds the square
 * root of original value n
 * Making the algorithm to be to the O(n).
 */
public class Prime {
    private static boolean isPrime(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main() {
        System.out.println("================================\nDemontrating how to calculate prime number");
        Scanner inputValue = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int value;

        try {
            value = inputValue.nextInt();
            double startTime = System.nanoTime();
            boolean isPrimeStatus = Prime.isPrime(value);
            double endTime = System.nanoTime();

            if (isPrimeStatus) {
                System.out.println("Is a prime number");
            } else {
                System.out.println("Not a prime number");
            }
            System.out.println("To calculate prime it took " + (endTime - startTime) + " ms");
        } catch (InputMismatchException e) {
            System.out.println("You entered a value that cannot be converted to an integer");
        }
        // Do not close the Scanner as it may cause the Scanner from the Main class to
        // close as well, leave it commented out like below, dont act smart.
        // inputValue.close();
    }
}
