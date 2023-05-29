package com.leoita.FP02_functional_interface;

import java.util.List;
import java.util.function.Predicate;

public class FI02_BehaviorParameterization {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(29,12,83,3,4,5,1);

        Predicate<Integer> integerPredicate = x -> x % 2 == 0;

        filterAndPrint(numbers, integerPredicate);


    }
    //we use predicate as parameter for another method
    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> integerPredicate) {
        numbers.stream()
                .filter(integerPredicate)
                .forEach(System.out::println);
    }


}
