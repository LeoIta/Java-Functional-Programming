package com.leoita.FP01_structured_vs_declarative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SD8_new_Collection extends Programming {
    public static void main(String[] args) {

    /*
    print:
    - get a new list with cube value of elements
    - get a new list with 'Spring' courses
    */

        //structured
        List<Integer> cube = new ArrayList<>();
        for (int number : numbers) {
            cube.add(number * number * number);
        }

        System.out.println(cube);

        List<String> spring = new ArrayList<>();
        for (String course : courses) {
            if (course.contains("Spring")) {
                spring.add(course);
            }
        }

        System.out.println(spring);

        System.out.println("###########################################");

        //declarative
        System.out.println(
                numbers.stream()
                        .map(number -> number * number * number)
                        .collect(Collectors.toList())
        );

        System.out.println(
                courses.stream()
                        .filter(course -> course.contains("Spring"))
                        .collect(Collectors.toList())
        );


        /*
           please notice that:
          .collect(Collectors.toList()) return a mutable list
          .toList() return an immutableList
        */

    }
}
