package com.leoita.FP02_functional_interface.operators;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class _BinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<Double> binaryMaxOperator = BinaryOperator.maxBy(
                DoubleComparator());
        double value = 7.0;
        double value1 = 3.5;
        Double maxBetweenDouble = binaryMaxOperator.apply(value,value1);
        System.out.printf("between %f and %f the max value is: %f%n",value,value1, maxBetweenDouble);

        BinaryOperator<Integer> binaryMinOperator = BinaryOperator.minBy(
                Integer::compareTo);
        int value2= 3;
        int value3 = 9;
        Integer minBetweenInt = binaryMinOperator.apply(value2,value3);
        System.out.printf("between %d and %d the max value is: %d",value2,value3, minBetweenInt);

    }

    static Comparator<Double> DoubleComparator() {
        return (a, b) -> (a > b) ? 1 : ((a == b) ? 0 : -1);
    }

}
