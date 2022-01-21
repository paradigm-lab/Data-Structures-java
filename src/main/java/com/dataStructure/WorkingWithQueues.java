package com.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {

    // Created a static method
    static record Person(String name, int age) {

    }

    public static void main(String[] args) {

        // Created the Queue Object of the type person
        Queue<Person> supermarket = new LinkedList<>();

        // Using the object to add the person into the class
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Mariam", 18));
        supermarket.add(new Person("Ali", 60));

        System.out.println(supermarket.peek());

    }
}
