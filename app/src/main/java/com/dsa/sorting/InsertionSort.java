package com.dsa.sorting;

import java.util.Scanner;

/**
 * To implement an insertion sort, we need.
 * 
 * 1. An array with values to sort.
 * 
 * 2. An outer array that picks a value to be sorted. For an array with n values
 * the outer loops runs n - 1 times
 * 
 * 3. An inner loop that will go through the sorted part of the array to find
 * out where to insert the value.
 * If the value to be sorted is at index i, the sorted part of array start at
 * index 0 and ends at i - 1.
 */
public class InsertionSort {
    /**
     * Performs the insertion sort mechanism. provide to it the array and it will
     * make it sorted.
     * 
     * @param arr[]
     */
    private static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) { // starts at index 1
            int current_value = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current_value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current_value;
        }
    }

    public static void main() {
        System.out.println("Demonstrating the insertion sort algorithm");
        System.out.println("Lets create an array for you");
        System.out.print("What size do you want: ");

        Scanner inputScanner = new Scanner(System.in);
        int size;
        try {
            size = inputScanner.nextInt();
            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("Input " + (i + 1) + ": ");
                array[i] = inputScanner.nextInt();
            }

            System.out.println("Already got your array for you");
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("]\n");

            double startTime = System.nanoTime();
            InsertionSort.insertionSort(array);
            double endTime = System.nanoTime();

            System.out
                    .println("After insertion sort which took " + (endTime - startTime) + " ms. The final array was.");
            System.out.print("[");
            for (int i = 0; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.print("]\n");
        } catch (Exception e) {
            System.out.println("looks like you did not provide a number. size must be a number");
        }
    }
}
