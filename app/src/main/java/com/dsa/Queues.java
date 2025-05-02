package com.dsa;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
  public static void main(String[] args) {
    // A Queue is a collection designed for holding elements prior to processing.
    // Besides basic Collection operations, queues provide additional insertion,
    // extraction,
    // and inspection operations
    // Queue<String> queue = new Queue<String>(); // queue cannot be instantiated
    // bcs it is an interface

    // syntax
    // offer() = enqueue or add
    // poll() = dequeue or remove
    // peek() = will not remove it but examine it and return it
    Queue<String> queue = new LinkedList<>();
    queue.offer("Karen");
    queue.offer("Chad");
    queue.offer("Steve");
    queue.offer("Harold");

    System.out.println(queue.peek());
    System.out.println(queue);
    queue.poll();
    System.out.println(queue);
    /**
     * since queue inherits the collection class there are other useful methods we
     * could use
     * these include
     * isEmpty() checks if the collection is empty
     * size() checks the number of objects in the collection
     * contains() check the presence of object
     */

    /**
     * why are queues usefull
     * 1. Keyboard buffer - letters should appear in the screen in the order they
     * are placed
     * 2. printer queue - print jobs should be completed in order
     * 3. used in LinkedLists, PriorityQueues, Breadth-first search
     */
  }
}
