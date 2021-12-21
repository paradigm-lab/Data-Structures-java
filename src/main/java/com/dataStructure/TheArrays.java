package com.dataStructure;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[]  args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);
        System.out.println(colors[2]);
        System.out.println(colors[3]);
        System.out.println(colors[4]);

        colors[2] = "yellow";
        System.out.println(Arrays.toString(colors));

        /*
        * We are using this approach if we now the element that our array will have
         */
        int[] numbers = {100, 200};

        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        /*
        *   Using the reverse approach
         */
        System.out.println();
        System.out.println("Using the Reverse approach");
        for (int i = colors.length - 1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println();
        System.out.println("Using the Enhanced for loop");
        for (String color: colors) {
            System.out.println(color);
        }

        // Using Stream to print the array
        System.out.println("Using the Stream to print the array");
        Arrays.stream(colors).forEach(System.out::println);
    }
}
