package com.dsa;

import java.util.*;

public class LinkedListsCode {
    public static void main(String[] args) {
        // LinkedList = Stores Nodes in 2 parts (data + address)
        // Nodes are in non-consecutive memory locations
        // Elements are linked using pointers

        // Singly Linked List
        // [data | address] -> [data | address] -> [data | address]

        // Doubly Linked List
        // [address| data | address] <-> [address | data | address]

        // advantages
        // 1. Dynamic Data Structure (allocates memory when running).
        // 2. Insertion and Deletion of Nodes is easy.
        // 3. No/Low memory waste.

        // disadvantages
        // 1. Greater memory usage (additionally pointer)
        // 2. No random access of elements (no index[i])
        // 3. Accessing/searching elements is more time consuming. O(n)

        // uses?
        // 1. implement Stacks/Queue
        // 2. GPS navigation
        // 3. music playlist

        LinkedList<String> linkedlist = new LinkedList<>();
        // we can treat it as a stack
        /*
         * linkedlist.push("A");
         * linkedlist.push("B");
         * linkedlist.push("C");
         * linkedlist.push("D");
         * linkedlist.push("F");
         * linkedlist.pop();
         */

        // we can treat it as a queue

        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("C");
        linkedlist.offer("D");
        linkedlist.offer("F");
        // linkedlist.poll();

        // to add an element
        linkedlist.add(4, "E");
        // to remove an element
        linkedlist.remove("E");
        // to search for the first element
        System.out.println(linkedlist.peekFirst());
        // to search for the last element
        System.out.println(linkedlist.peekLast());
        // to add element before the first element
        linkedlist.addFirst("0");
        // to add last element
        linkedlist.addLast("G");
        // to check the position of the element
        System.out.println(linkedlist.indexOf("A"));
        System.out.println(linkedlist);
    }

}
