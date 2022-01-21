package com.dataStructure;

import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        // Creating a stack object
        Stack<Integer> stack = new Stack<>();

        // Using the push method to add the integer values into the stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        // Using the peek method to see the element on the top of the stack
        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println();

        // Using the pop method to remove the last value in the stack
        System.out.println(stack.pop());
        System.out.println(stack.size());


    }
}
