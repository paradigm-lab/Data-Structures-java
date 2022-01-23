package com.dataStructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WorkingWithMaps {

    static class Person{
        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }

    record Diamond(String name) {

    }

   private static void maps() {
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

        map.remove(3);

        map.entrySet().forEach(System.out::println);

        System.out.println();

        // Using a lambda
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println();

        // Using a lambda function without using the entrySet method
        map.forEach(((key, person) -> {
            System.out.println(key + " - " + person);
        }));

        System.out.println(map.getOrDefault(3, new Person("Default")));

        System.out.println(map.values());
    }


    public static void main(String[] args) {
        Map<Person, Diamond> map = new HashMap<>();
        map.put(new Person("Jamila"), new Diamond("African Diamond"));

        System.out.println(new Person("Golang").hashCode());
        System.out.println(new Person("Golang").hashCode());
        System.out.println(map.get(new Person("Jamila")));
    }


}
