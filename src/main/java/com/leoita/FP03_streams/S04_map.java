package com.leoita.FP03_streams;

import java.util.List;
import java.util.stream.Collectors;

public class S04_map {

    public static void main(String[] args) {

    List<Person> people = List.of(
            new Person("Alex", 14),
            new Person("Phil", 22),
            new Person("Anna", 10),
            new Person("John", 33),
            new Person("Sarah", 26)
    );

        people.stream()
                .map(person -> person.name().toUpperCase())
                .forEach(System.out::println);
    }

    record Person (String name, int age){}
}
