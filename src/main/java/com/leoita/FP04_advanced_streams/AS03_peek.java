package com.leoita.FP04_advanced_streams;

import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class AS03_peek {
    public static void main(String[] args) {

        /*
         I close the stream with terminal operation sum(),
         but you don't know what was inside the range
         */
        IntUnaryOperator powerOfTwo = n -> n * 2;
        System.out.println(
                IntStream.iterate(1, powerOfTwo).limit(5).sum());
        /*
        If I want to add also the range content,
        you can use the peek() intermediate operation
        */
        System.out.println("####Using peek()########");
        System.out.println(
                IntStream.iterate(1, powerOfTwo).limit(5)
                        .peek(System.out::println)
                        .sum());
    }
}
