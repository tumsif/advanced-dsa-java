package com.dsa;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedArrayListComp {
    public static void main(String[] args) {
        // comparing the excecution time for linked vs arraylist in java
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        // tracking time : starttime, endtime, elapsed time
        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        // ************************LinkedList****************************
        startTime = System.nanoTime();

        // linkedList.get(0);
        // linkedList.get(500000);
        // linkedList.get(999999);
        // it is observed that when the element is closer to end it takes less time bcs
        // linkedList is a double liked list
        linkedList.remove(0);
        linkedList.remove(500000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Linked List:\t " + elapsedTime + " ns");

        // ************************ArrayList***************************
        startTime = System.nanoTime();
        // arrayList.get(0);
        // arrayList.get(500000);
        // arrayList.get(999999);
        arrayList.remove(0);
        arrayList.remove(500000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Array List:\t " + elapsedTime + " ns");

    }
}
