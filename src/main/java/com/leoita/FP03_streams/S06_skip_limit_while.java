package com.leoita.FP03_streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class S06_skip_limit_while {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Phil", 22),
                new Person("John", 24),
                new Person("Alex", 18),
                new Person("Sarah", 26)
        );

        System.out.println("the 2 older people");
        people.stream()
                .sorted(Comparator.comparing(Person::age).reversed())
                .limit(2)
                .forEach(System.out::println);
        System.out.println("the third older person");
        people.stream()
                .sorted(Comparator.comparing(Person::age).reversed())
                .skip(2)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("take while you don't find Alex");
        people.stream()
                .takeWhile(person -> !person.name().equals("Alex"))
                .forEach(System.out::println);

        System.out.println("skip while age is more than 18");
        System.out.println(people.stream()
                .dropWhile(person -> person.age()>18)
                .collect(Collectors.toList()));


    }

    record Person(String name, int age) {
    }
}
