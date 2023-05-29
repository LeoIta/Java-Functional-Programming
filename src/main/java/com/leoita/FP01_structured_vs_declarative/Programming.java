package com.leoita.FP01_structured_vs_declarative;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

public class Programming {

    protected static List<Integer> numbers =  List.of(6, 1, 5, 4, 9, 6, 2, 4);

    protected static List<String> courses = List.of(
            "Java Collections",
            "Spring Security",
            "AWS",
            "Spring Boot",
            "AWS",
            "Spring Security",
            "Java Streams"
    );

    @Getter //it generates all the getter
    @Setter //it generates all the setter
    @Accessors(chain = true) //setter will return aPerson object instead of void
    @AllArgsConstructor // it generates a constructor with all the fields
    public static class Person {
        private String name;
        private int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
