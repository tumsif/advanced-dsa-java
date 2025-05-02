package com.dsa.sorting;

/**
 * To implement a bubble sorting we need.
 * 1. An array with values to sort.
 * 2. An inner loop that goes through the array and swaps values if the first
 * value is higher than the next value. This loop must loop through one less
 * value each time it runs.
 * 3. An outer loop that controls how many times the inner loop must run. For an
 * array with n values, this outer loop must run n-1 times.
 */
public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * The way this is improved is that sometimes an array is already filtered,
     * going through the array once again when it is filtered is less efficient.
     * Now the way it is improved is that we set a flag that if it is not swapped
     * i.e sorted we dont bother going through again
     */
    public static void bubbleSortImproved(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    public static void main() {
        System.out.println("==========================\nDemonstrating a bubble sort mechanism");
        System.out.println("Consider an array [64, 34, 25, 12, 22, 11, 90, 5]");
        int[] arrayValue = { 64, 34, 25, 12, 22, 11, 90, 5 };
        double startTime = System.nanoTime();
        BubbleSort.bubbleSort(arrayValue);
        double endTime = System.nanoTime();
        System.out.print("Array after bubble sorting [");
        for (int num : arrayValue) {
            System.out.print(num + ", ");
        }
        System.out.print("]\n");
        System.out.println("It took about " + (endTime - startTime) + " ms");

        System.out.println(
                "However there is an improvement that prevent redoing the whole sorting operation for sorted arrays, ");
        System.out.println("Example lets consider using the already sorted array");
        startTime = System.nanoTime();
        BubbleSort.bubbleSort(arrayValue);
        endTime = System.nanoTime();
        System.out.println("The first normal one took " + (endTime - startTime) + " ms.");

        startTime = System.nanoTime();
        BubbleSort.bubbleSortImproved(arrayValue);
        endTime = System.nanoTime();
        System.out.println("The improved one took " + (endTime - startTime) + " ms.");
    }
}
