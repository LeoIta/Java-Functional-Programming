package com.leoita.FP02_functional_interface.function;


import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int value = 3;
        int value1 = 4;
        //imperative
        int doubleValue = doubleValue(value);
        int sqValue = square(doubleValue);
        int sqValue3 = doubleSum(value,value1);
        System.out.println("\n####################IMPERATIVE####################");
        System.out.printf("The square of %d is %d%n", value, square(value));
        System.out.printf("The result for %d is %d%n", value, sqValue);
        System.out.printf("The double sum of %d and %d is %d%n", value, value1, sqValue3);

        //declarative
        System.out.println("\n####################DECLARATIVE####################");
        //Function
        Function<Integer, Integer> doubleFunction = input -> input * 2;
        Function<Integer, Integer> squareFunction = input -> input * input;
        System.out.printf("The square of %d is %d%n", value, squareFunction.apply(value));
        Integer sqValue2 = doubleFunction.andThen(squareFunction).apply(3);
        System.out.printf("The result for %d is %d%n", value, sqValue2);
        //BIFunction
        BiFunction<Integer, Integer, Integer> SumAndThenDouble = (a, b) -> (a + b) * 2;
        Integer sqValue4 = SumAndThenDouble.apply(value, value1);
        System.out.printf("The double sum of %d and %d is %d%n", value, value1, sqValue4);
    }

    static int doubleValue(int value) {
        return value * 2;
    }

    static int doubleSum(int a, int b) {
        return (a + b) * 2;
    }

    static int square(int value) {
        return value * value;
    }
}
