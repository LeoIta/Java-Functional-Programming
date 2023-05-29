package com.leoita.FP01_structured_vs_declarative;

public class SD4_map extends Programming {

    public static void main(String[] args) {

    /*
    print:
    - square numbers
    - capitalize courses names
    */

        //structured

        for (int number : numbers) {
            System.out.println(square(number));
        }

        for (String course : courses) {
            System.out.println(course.toUpperCase());
        }

        System.out.println("###########################################");

        //declarative

        numbers.stream()
                .map(number-> number * number)
                .forEach(System.out::println);
        courses.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }

    static int square(int number) {
        return number * number;
    }

}
