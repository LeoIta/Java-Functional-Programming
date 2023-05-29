package com.leoita.FP01_structured_vs_declarative;

public class SD2_filter extends Programming {

    public static void main(String[] args) {

    /*
    print:
    - even numbers
    - courses that contains word Spring
    */

        //structured

        for (int number : numbers) {
            if (isEven(number)) {
                System.out.println(number);
            }
        }

        for (String course : courses) {
            if (containsSpring(course)) {
                System.out.println(course);
            }
        }

        System.out.println("###########################################");

        //declarative

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean containsSpring(String course) {
        return course.contains("Spring");
    }

}
