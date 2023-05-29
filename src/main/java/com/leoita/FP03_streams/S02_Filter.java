package com.leoita.FP03_streams;

import java.util.List;
import java.util.stream.Collectors;

public class S02_Filter {

    public static void main(String[] args) {

    List<Person> people = List.of(
            new Person("Alex", 14),
            new Person("Phil", 22),
            new Person("Anna", 10),
            new Person("John", 33),
            new Person("Sarah", 26)
    );

        List<Person> adults = people.stream()
                .filter(person -> person.age >= 18)
                .collect(Collectors.toList());

        System.out.println(adults);
    }

    record Person (String name, int age){}
}
