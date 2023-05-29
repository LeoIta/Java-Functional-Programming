package com.leoita.FP01_structured_vs_declarative;

public class SD7_reduce extends Programming {

    public static void main(String[] args) {

    /*
    print:
    - multiply of all numbers
    - sum of word length
    */

        //structured
        int numbersProduct = 1;
        for (int number : numbers) {
            numbersProduct *= number;
        }
        System.out.println("Product of numbers is: " + numbersProduct);

        int courseLengthSum = 0;
        for (String course : courses) {
            courseLengthSum += course.length();
        }
        System.out.println("Total sum of courses length is: " + courseLengthSum);

        System.out.println("###########################################");

        //declarative

        int multiplyInt = numbers.stream()
                .reduce(1, (a, b) -> a * b);
        System.out.println(multiplyInt);
        int sumCoursesLength = courses.stream()
                .map(String::length)
                .reduce(0, Integer::sum);
        System.out.println(sumCoursesLength);

    }

}
