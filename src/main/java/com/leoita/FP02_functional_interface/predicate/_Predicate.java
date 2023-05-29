package com.leoita.FP02_functional_interface.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        Predicate<Integer> isEvenPredicate = a -> a % 2 == 0;
        Predicate<Integer> multiple3Predicate = b -> b % 3 == 0;
        BiPredicate<Integer, Integer> sumIsMultipleOf5Predicate = (a,b) -> (a+b)%5==0;
        int value = 9;
        int value1 = 1;
        System.out.println("\n####################IMPERATIVE####################");
        System.out.printf("%d is even: %b", value, isEven(value));
        System.out.println();
        System.out.printf("%d is odd: %b", value, !isEven(value));
        System.out.println();
        System.out.printf("%d is multiple of 3: %b", value, multiple3(value));
        System.out.println();
        System.out.printf("%d is multiple of 3 and 2: %b", value, multiple3(value)  && isEven(value));
        System.out.println();
        System.out.printf("%d is multiple of 3 or 2: %b", value, multiple3(value) || isEven(value));
        System.out.println();
        System.out.printf("sum of %d and %d is multiple of 5: %b", value, value1, sumIsMultipleOf5(value, value1));
        System.out.println("\n####################DECLARATIVE####################");
        System.out.printf("%d is even: %b", value, isEvenPredicate.test(value));
        System.out.println();
        System.out.printf("%d is odd: %b", value, isEvenPredicate.negate().test(value));
        System.out.println();
        System.out.printf("%d is multiple of 3: %b", value, multiple3Predicate.test(value));
        System.out.println();
        System.out.printf("%d is multiple of 3 and 2: %b", value, multiple3Predicate.and(isEvenPredicate).test(value));
        System.out.println();
        System.out.printf("%d is multiple of 3 or 2: %b", value, multiple3Predicate.or(isEvenPredicate).test(value));
        System.out.println();
        System.out.printf("sum of %d and %d is multiple of 5: %b", value, value1, sumIsMultipleOf5Predicate.test(value, value1));
    }

    static boolean isEven(int a){
        return a % 2 == 0;
    }

    static boolean multiple3(int b){
        return b % 3 == 0;
    }

    static boolean sumIsMultipleOf5 (int a , int b){
        return (a+b)%5==0;
    }
}
