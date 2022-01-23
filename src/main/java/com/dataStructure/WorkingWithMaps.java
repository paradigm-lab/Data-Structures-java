package com.dataStructure;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {

    record Person(String name) {

    }

    public static void main(String[] args) {
        // Created a map object
        Map<Integer, Person> map = new HashMap<>();

        // Using the put method to add the key and value in the map
        map.put(1, new Person("Alex"));
        map.put(2, new Person("Collins"));
        map.put(3, new Person("Mariam"));
        // Printing out the map
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(4));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
    }

}
