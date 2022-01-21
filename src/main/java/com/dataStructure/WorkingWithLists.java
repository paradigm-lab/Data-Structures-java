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
    }
}
