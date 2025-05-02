package com.dsa;

import java.util.*;

public class PriorityQueues {
    public static void main(String[] args) {
        /** Priority data structure */

        // using normal data structure this is non priority queues
        // Queue<Double> queue = new LinkedList<>();

        // using priority data structure the elements are arranged in levels of priority
        // Queue<Double> queue = new PriorityQueue<>();

        // the above arranges in ascending to arrange in descending we pass an argument
        // Collections.reverseOrder()
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
