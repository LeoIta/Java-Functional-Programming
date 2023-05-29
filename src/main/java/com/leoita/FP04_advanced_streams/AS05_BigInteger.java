package com.leoita.FP04_advanced_streams;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class AS05_BigInteger {
    public static void main(String[] args) {

        //Using IntStream
        System.out.println("#############IntStream#############");
        System.out.println("integer max value: " + Integer.MAX_VALUE);
        int productInsideInt = IntStream.rangeClosed(1, 16).reduce(1, (x, y) -> x * y);
        System.out.println("Product of first 16 numbers is inside int: " + productInsideInt);
        int productExceedInt = IntStream.rangeClosed(1, 17).reduce(1, (x, y) -> x * y);
        System.out.println("Product of first 17 numbers exceed int: " + productExceedInt);

        //Using LongStream
        System.out.println("#############LongStream#############");
        System.out.println("integer max value: " + Long.MAX_VALUE);
        long productInsideLong = LongStream.rangeClosed(1, 20).reduce(1L, (x, y) -> x * y);
        System.out.println("Product of first 20 numbers is inside long: " + productInsideLong);
        long productExceedLong = LongStream.rangeClosed(1, 21).reduce(1L, (x, y) -> x * y);
        System.out.println("Product of first 17 numbers exceed long: " + productExceedLong);

        //Using BigInteger
        System.out.println("#############BigInteger#############");
        BigInteger productBigInteger = LongStream.rangeClosed(1, 21)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println("Product of first 21 numbers is inside long: " + productBigInteger);
        BigInteger productBigInteger100 = LongStream.rangeClosed(1, 100)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println("Product of first 100 numbers: " + productBigInteger100);

    }
}
