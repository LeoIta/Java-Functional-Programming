package com.leoita.FP01_structured_vs_declarative;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SD5_sorted extends Programming {

    public static void main(String[] args) {

    /*
    print:
    - ordered numbers
    - courses sorted by names from A to Z
    */


        //structured

        /*next 2 lines steps are required to change the ImmutableCollections numbers,
        generated with List.of() method, to mutable Collections etc.*/
        List<Integer> mutableNumbersList = new ArrayList<>(numbers);
        List<String> mutableCoursesList = new ArrayList<>(courses);
        // We order the list
        // you have to provide and argument for the sort() method
        //you can provide Comparator.naturalOrder()
        mutableNumbersList.sort(Comparator.naturalOrder());
        // you cn provide null, and it will use again the default Comparator.naturalOrder()
        mutableCoursesList.sort(null);

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
                .sorted()
                .forEach(System.out::println);

        courses.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
