package com.leoita.FP02_functional_interface.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * <p>Consumer &lt;T&gt; takes 1 argument of type T and return void</p>
 * <p>BiConsumer &lt;T, U&gt; takes 2 arguments of type T and U and return void </p>
 */
public class _Consumer {
    public static void main(String[] args) {

        var person1 = new Person("Alex", 24);
        var person2 = new Person("Anna", 22);

        //imperative
        System.out.println("\n####################IMPERATIVE####################");
        sayHello(person1);
        System.out.println();
        sayHello(person1);
        sayAge(person1);
        sayNameAndAge(person1.name(), person1.age());

        //declarative
        System.out.println("\n####################DECLARATIVE####################");
        Consumer<Person> sayHelloConsumer = person ->
                System.out.printf("Hello %s ", person.name());
        Consumer<Person> sayAgeConsumer = person ->
                System.out.printf("you are %d years old%n", person.age());
        BiConsumer<String, Integer> nameAndAgeConsumer = (name, age) ->
                System.out.printf("Hello %s you are %d years old%n", name, age);

        sayHelloConsumer.accept(person2);
        System.out.println();
        sayHelloConsumer.andThen(sayAgeConsumer).accept(person2);
        nameAndAgeConsumer.accept(person2.name(), person2.age());
    }

    static void sayHello(Person person) {
        System.out.printf("Hello %s ", person.name());
    }

    static void sayAge(Person person) {
        System.out.printf("you are %d years old%n", person.age());
    }

    static void sayNameAndAge(String name, Integer age) {
        System.out.printf("Hello %s you are %d years old%n", name, age);
    }

    record Person(String name, Integer age) {
    }

}
