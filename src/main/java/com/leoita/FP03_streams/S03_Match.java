package com.leoita.FP03_streams;

import java.util.List;

public class S03_Match {

    public static void main(String[] args) {

    List<Person> people = List.of(
            new Person("Alex", 14),
            new Person("Phil", 22),
            new Person("Anna", 10),
            new Person("John", 33),
            new Person("Sarah", 26)
    );

        boolean areAllAdults = people.stream().allMatch(person -> person.age >= 18);
        boolean isThereAnyAdult = people.stream().anyMatch(person -> person.age >= 18);
        boolean noOneIsCalledFrank = people.stream().noneMatch(person -> person.name.equals("Frank"));

        System.out.println("areAllAdults: " + areAllAdults);
        System.out.println("isThereAnyAdult: " + isThereAnyAdult);
        System.out.println("noOneIsCalledFrank: " + noOneIsCalledFrank);

    }


    record Person (String name, int age){}

}
