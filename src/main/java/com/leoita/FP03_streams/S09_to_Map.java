package com.leoita.FP03_streams;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class S09_to_Map {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alex", 14, 0),
                new Person("Phil", 22, 1),
                new Person("Anna", 10, 0),
                new Person("John", 33, 3),
                new Person("Sarah", 26, 3)
        );
        System.out.println("group people by diplomas");
        System.out.println(people.stream()
                .collect(Collectors.groupingBy(Person::diplomas))
                );
        //{0=[Person[name=Alex, age=14, diplomas=0], Person[name=Anna, age=10, diplomas=0]],
        // 1=[Person[name=Phil, age=22, diplomas=1]],
        // 3=[Person[name=John, age=33, diplomas=3], Person[name=Sarah, age=26, diplomas=3]]}

        System.out.println("group people by diplomas and return number of people for group");
        System.out.println(people.stream()
                .collect(Collectors.groupingBy(Person::diplomas, Collectors.counting()))
        );
        //{0=2, 1=1, 3=2}

        System.out.println("group people by diplomas and return the younger");
        System.out.println(people.stream()
                .collect(Collectors.groupingBy(Person::diplomas,
                        Collectors.maxBy(Comparator.comparing(Person::age))))
        );

        System.out.println("group people by diplomas and give name");
        System.out.println(people.stream()
                .collect(Collectors.groupingBy(Person::diplomas,
                        Collectors.mapping(Person::name, Collectors.toList())))
        );
    }

    record Person(String name, int age, int diplomas) {
    }
}
