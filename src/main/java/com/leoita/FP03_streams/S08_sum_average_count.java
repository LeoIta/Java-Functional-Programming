package com.leoita.FP03_streams;

import java.util.Comparator;
import java.util.List;

public class S08_sum_average_count {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Alex", 14, 0),
                new Person("Phil", 22, 1),
                new Person("Anna", 10, 0),
                new Person("John", 33,3),
                new Person("Sarah", 26,3)
        );
        System.out.println("count how many people with age >=18");
        System.out.println(people.stream()
                .map(person -> person.age >= 18)
                .count());
        //5

        System.out.println("average age of people");
        System.out.println(people.stream()
                .mapToInt(Person::age)
                .average());
        //OptionalDouble[21.0]

        System.out.println("average age of people or else 0");
        System.out.println(people.stream()
                .mapToInt(Person::age)
                .average()
                .orElse(0));
        //21.0

        System.out.println("total number of diplomas");
        System.out.println(people.stream()
                .mapToInt(Person::diplomas)
                .sum());
        //7

        System.out.println("total statistics of diplomas");
        System.out.println(people.stream()
                .mapToInt(Person::diplomas)
                .summaryStatistics());
        //IntSummaryStatistics{count=5, sum=7, min=0, average=1,400000, max=3}
    }

    record Person(String name, int age, int diplomas) {
    }
}
