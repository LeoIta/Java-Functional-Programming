package com.leoita.FP04_advanced_streams;

import java.util.ArrayList;
import java.util.List;

public class AS13_replaceAll_removeIf {

    public static void main(String[] args) {
        List<String> courses = List.of("Java", "Python", "JavaScript", "C", "TypeScript");

        var arrayCourses = new ArrayList<>(courses) ;
        arrayCourses.removeIf(course->course.length()<5);
        System.out.println("########REMOVEIF#########");
        arrayCourses.forEach(System.out::println);
        System.out.println("########REPLACEALL#########");
        arrayCourses.replaceAll(String::toUpperCase);
        arrayCourses.forEach(System.out::println);



    }
}
