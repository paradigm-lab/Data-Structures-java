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

        // Using the peek method to see the first person in the queue
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());

        // Using the poll method to remove the person from the queue
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());


    }
}
