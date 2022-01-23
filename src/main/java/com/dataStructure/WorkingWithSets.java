package com.dataStructure;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {

    //record Ball(String color) {}

    // A static class which replaced the record method
    static class Ball {
        // Filed in the class
        String color;

        // A class constructor
        public Ball(String color) {
            this.color = color;
        }
    }

    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Blue"));
        balls.add(new Ball("Yellow"));
        balls.add(new Ball("Red"));

        // Printing out the size of the Hashset
        System.out.println(balls.size());

        // Using the forEach to print out the values in the set
        balls.forEach(System.out::println);
    }
}
