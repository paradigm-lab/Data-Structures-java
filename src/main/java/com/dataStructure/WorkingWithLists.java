package com.dataStructure;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        // Creating an object for the ArrayList class which is implementing the List interface
        List<String> colors = new ArrayList<>();

        //Using the add method to add the values in the array list
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");

        // Using the size method to check the size of the array
        System.out.println(colors.size());

        // Using the contains method to check if the string value contains in the array list
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("pink"));

        // Printing out the arraylist
        System.out.println(colors);

        // Using the for loop to loop through the array
        // Using the enhanced for loop to loop through the Array List
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println();

        // Using for each loop
        colors.forEach(System.out::println);

        System.out.println();

        // Using the traditional for loop to iterator through the array list
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}
