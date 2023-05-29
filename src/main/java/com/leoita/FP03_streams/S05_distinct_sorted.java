package com.leoita.FP03_streams;

import java.util.Comparator;
import java.util.List;

public class S05_distinct_sorted {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alex", 14),
                new Person("Phil", 22),
                new Person("Alex", 14),
                new Person("John", 22),
                new Person("Sarah", 26)
        );

        System.out.println("order by name from A to Z");
        people.stream()
                .distinct()
                .sorted(Comparator.comparing(Person::name))
                .forEach(System.out::println);

        System.out.println("order by age from older to younger");
        people.stream()
                .distinct()
                .sorted(Comparator.comparing(Person::age).reversed())
                .forEach(System.out::println);

        System.out.println("order by age from older to younger and by name from A to Z");
        people.stream()
                .distinct()
                .sorted(
                        Comparator.comparing(Person::age).reversed()
                                .thenComparing(Person::name)
                )
                .forEach(System.out::println);
    }

    record Person(String name, int age) {
    }
}
