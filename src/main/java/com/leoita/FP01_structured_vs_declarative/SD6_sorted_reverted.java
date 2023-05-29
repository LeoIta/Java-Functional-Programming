package com.leoita.FP01_structured_vs_declarative;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SD6_sorted_reverted extends Programming {

    public static void main(String[] args) {

    /*
    print:
    - reverted ordered numbers
    - courses sorted by names from Z to A
    */

        //structured

        /*next 2 lines steps are required to change the ImmutableCollections numbers,
        generated with List.of() method, to mutable Collections etc.*/
        List<Integer> mutableNumbersList = new ArrayList<>(numbers);
        List<String> mutableCoursesList = new ArrayList<>(courses);
        // We order the list
        mutableNumbersList.sort(Comparator.reverseOrder());
        mutableCoursesList.sort(Comparator.reverseOrder());
        //print elements
        for (int number : mutableNumbersList) {
            System.out.println(number);
        }

        for (String course : mutableCoursesList) {
            System.out.println(course);
        }

        System.out.println("###########################################");

        //declarative

        numbers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        courses.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

    }

}
