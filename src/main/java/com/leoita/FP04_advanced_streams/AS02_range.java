package com.leoita.FP04_advanced_streams;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class AS02_range {

    public static void main(String[] args) {

        //define a standard range with default step
        System.out.println("#####RANGE########");

        int startValue = 1;
        int endValue = 5;
        IntStream rangeFrom1to10Excluded = IntStream.range(startValue, endValue);
        IntStream rangeFrom1to10Included = IntStream.rangeClosed(startValue, endValue);

        System.out.println(rangeFrom1to10Excluded.sum());//1+2+3+4=10
        System.out.println(rangeFrom1to10Included.sum());//1+2+3+4+5=15

        //customized range with customized steps
        System.out.println("#####ITERATE########");
        IntUnaryOperator stepDefinition = n -> n + 2;
        IntStream iterateStream = IntStream.iterate(startValue, stepDefinition);
        //we MUST set a limit for iterateStream, or it will be infinitive
        System.out.println("first 5 odd numbers");
        iterateStream.limit(5).forEach(System.out::println);
        // even numbers
        System.out.println("first 5 even numbers");
        IntStream.iterate(2,stepDefinition).limit(5).forEach(System.out::println);


    }
}
