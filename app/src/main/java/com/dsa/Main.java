package com.dsa;

import java.util.Scanner;

import com.dsa.sorting.BubbleSort;
import com.dsa.sorting.InsertionSort;

class Main {
    public static void main(String[] args) {
        System.out.println("Data structures and algorithm course");
        Main.userChoicesDisplay();
        Scanner input = new Scanner(System.in);
        String userResponse;
        while (true) {
            System.out.print("Enter your choice: ");
            userResponse = input.nextLine();
            if (userResponse.equals("quit")) {
                break;
            } else if (userResponse.equals("dynamic array")) {
                DynamicArray.main();
            } else if (userResponse.equals("hash")) {
                Hash.main();
            } else if (userResponse.equals("prime")) {
                Prime.main();
            } else if (userResponse.equals("bubble")) {
                BubbleSort.main();
            } else if (userResponse.equals("insertion sort")) {
                InsertionSort.main();
            } else {
                System.out.println("Incorrect input");
                Main.userChoicesDisplay();
            }
        }
        input.close();
    }

    public static void userChoicesDisplay() {
        System.out.println("\nChoose one of these option");
        System.out.println("-- 'quit': quit the user prompt");
        System.out.println("-- 'dynamic array': run the dynamic array main example");
        System.out.println("-- 'hash': demonstrate how hash tables work");
        System.out.println("-- 'prime': demonstrate calculating prime number");
        System.out.println("-- 'bubble': demonstrate bubble sorting");
        System.out.println("-- 'insertion sort': demonstrate insertion sorting algorithm");
    }
}
