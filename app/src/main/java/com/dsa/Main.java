package com.dsa;

class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);
        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        // until here the dynamic array will adjust to have a capacity of 10

        dynamicArray.delete("A");
        // dynamicArray.delete("B");
        // dynamicArray.delete("C");
        // dynamicArray.insert(0, "D");

        System.out.println(dynamicArray.search("F"));

        System.out.println(dynamicArray);
        System.out.println("Empty: " + dynamicArray.isEmpty());
        System.out.println("Size " + dynamicArray.size);
        System.out.println("Capacity " + dynamicArray.capacity);
    }
}
