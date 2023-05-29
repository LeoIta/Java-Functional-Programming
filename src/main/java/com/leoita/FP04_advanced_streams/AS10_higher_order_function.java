package com.leoita.FP04_advanced_streams;

import java.util.List;
import java.util.function.Function;

public class AS10_higher_order_function {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 6, 4, 9);

        Function<Integer, Integer> duplicateFunction = n -> n * 2;
        Function<Integer, Integer> tripleFunction = n -> n * 3;
        System.out.println("############duplicateFunction#####################");
        numbers.stream()
                .map(duplicateFunction)
                .forEach(System.out::println);

        System.out.println("#############tripleFunction####################");
        numbers.stream()
                .map(tripleFunction)
                .forEach(System.out::println);
        System.out.println("###########higher order function######################");
        /*
        Higher order function are function that return another function
        */
        Function<Integer, Function<Integer, Integer>> multiplyFunction = i -> n -> n * i;

        numbers.stream()
                .map(multiplyFunction.apply(4))
                .forEach(System.out::println);

    }

}
