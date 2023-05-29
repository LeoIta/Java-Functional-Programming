package com.leoita.FP03_streams;

import java.util.Comparator;
import java.util.List;

public class S07_max_min_find {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alex", 14),
                new Person("Phil", 22),
                new Person("Anna", 10),
                new Person("John", 33),
                new Person("Sarah", 26)
        );
        System.out.println("find first with age >=18");
        System.out.println(people.stream()
                .filter(person -> person.age >= 18)
                .findFirst());
        //Optional[Person[name=Phil, age=22]]

        System.out.println("find any with age >=18");
        System.out.println(people.stream()
                .filter(person -> person.age >= 18)
                .findAny());
        //Optional[Person[name=Phil, age=22]]

        System.out.println("find any with age >=90");
        System.out.println(people.stream()
                .filter(person -> person.age >= 90)
                .findAny());
        //Optional.empty

        System.out.println("find first with age >=90 or else Pete");
        System.out.println(people.stream()
                .filter(person -> person.age >= 90)
                .findFirst()
                .orElse(new Person("Pete", 29)));
        //Person[name=Pete, age=29]

        System.out.println("find any with age >=18 or else Pete");
        System.out.println(people.stream()
                .filter(person -> person.age >= 18)
                .findAny()
                .orElse(new Person("Pete", 29)));
        //Person[name=Phil, age=22]]

        System.out.println("find younger person");
        System.out.println(people.stream()
                .min(Comparator.comparing(Person::age))
        );
        //Optional[Person[name=Anna, age=10]]

        System.out.println("find older person");
        System.out.println(people.stream()
                .max(Comparator.comparing(Person::age))
        );
        //Optional[Person[name=John, age=33]]
    }

    record Person(String name, int age) {
    }
}
