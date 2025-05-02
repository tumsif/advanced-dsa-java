package com.dsa;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        // stack = LIFO data structure
        Stack<String> stack = new Stack<>();
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        System.out.println(stack.empty()); // checks if the stack is empty
        System.out.println(stack);

        // stack.pop(); to remove the topmost object
        // String favGame = stack.pop(); returns an object so we can assign it
        // String worstGame = stack.peek(); // returns an object without removing it
        // System.out.println(stack.search("Borderlands")); // searches for an object
        // indexing starts at 1

        // uses of stacks
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

    }
}