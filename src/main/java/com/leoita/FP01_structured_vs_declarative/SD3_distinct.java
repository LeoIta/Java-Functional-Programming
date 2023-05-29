package com.leoita.FP01_structured_vs_declarative;

import java.util.ArrayList;
import java.util.List;

public class SD3_distinct extends Programming {

    public static void main(String[] args) {

    /*
    print:
    - unique numbers
    - unique courses
    */

        //structured
        List<Integer> uniqueNumbers = new ArrayList<>();
        for (int number : numbers) {
            if (isNotIntDuplicated(number, uniqueNumbers)) {
                uniqueNumbers.add(number);
            }
        }

        for (int number : uniqueNumbers) {
            System.out.println(number);
        }


        List<String> uniqueCourses = new ArrayList<>();
        for (String course : courses) {
            if (isNotStringDuplicated(course, uniqueCourses)) {
                uniqueCourses.add(course);
            }
        }

        for (String course : uniqueCourses) {
            System.out.println(course);
        }

        System.out.println("###########################################");

        //declarative

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
        courses.stream()
                .distinct()
                .forEach(System.out::println);
    }

    static boolean isNotIntDuplicated(int value, List<Integer> unique) {
        for (int number : unique) {
            if (number == value) return false;
        }
        return true;
    }

    static boolean isNotStringDuplicated(String value, List<String> unique) {
        for (String str : unique) {
            if (str.equals(value)) return false;
        }
        return true;
    }

}
