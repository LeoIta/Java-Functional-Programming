package com.leoita.FP04_advanced_streams;

import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AS04_collect {
    public static void main(String[] args) {

        IntUnaryOperator powerOfTwo = n -> n * 2;
        /*
        you cannot pass from a IntStream to a collection. This will not work:
                IntStream
                        .iterate(1, powerOfTwo).limit(5)
                        .collect(Collectors.toList())
        */
        //you need to wrap the primitive int into a Integer using the boxed() operator
        List<Integer> powersOfTwo = IntStream
                .iterate(1, powerOfTwo).limit(5)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(powersOfTwo);


    }
}
