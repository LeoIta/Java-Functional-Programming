package com.leoita.FP01_structured_vs_declarative;

public class SD1_forEach extends Programming {

    public static void main(String[] args) {

    /*
    print all elements
    */

        //structured
        for (int number: numbers) {
            System.out.println(number);
        }

        for (String person : courses) {
            System.out.println(person);
        }

        System.out.println("###########################################");

        //declarative

        numbers.stream().forEach(System.out::println);
        courses.stream().forEach(System.out::println);

    }

}
