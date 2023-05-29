package com.leoita.FP04_advanced_streams;

import java.util.List;
import java.util.stream.Collectors;

public class AS09_list_combination_numbers {
    public static void main(String[] args) {
        List<Integer> firstList = List.of(1, 2, 3, 4, 5, 6, 8, 9, 10);
        List<Integer> secondList = List.of(1, 2, 3, 4, 5, 6, 8, 9, 10);

        var sumTable = firstList.stream()
                .flatMap(v1 ->
                        secondList.stream()
                                .map(v2 -> v1 + v2)
                )
                .distinct()
                .collect(Collectors.toList());

        System.out.println(sumTable);

        var productTable = firstList.stream()
                .flatMap(v1 ->
                        secondList.stream()
                                .map(v2 -> v1 * v2)
                )
                .collect(Collectors.toList());

        System.out.println(productTable);
    }
}
