package com.leoita.FP02_functional_interface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FI01_FunctionalInterface {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        List<Integer> numbers = List.of(29,12,83,3,4,5,1);

        Predicate<Integer> isOddPredicate = x -> x % 2 == 1;
        Predicate<Integer> isOddPredicateExtended = new Predicate<>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 1;
            }
        };
        //@FunctionalInterface
        //public interface Predicate<T>
        //boolean test(T t);

        Function<Integer, Integer> CubeFunction = x -> x * x * x;
        Function<Integer, Integer> CubeFunctionExtended = new Function<>() {
            @Override
            public Integer apply(Integer x) {
                return x * x * x;
            }
        };
        //@FunctionalInterface
        //public interface Function<T, R> {
        //    R apply(T t);

        Consumer<Integer> printConsumer = System.out::println;
        Consumer<Integer> printConsumerExtended = new Consumer<>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

//        @FunctionalInterface
//        public interface Consumer<T> {
//            void accept(T t);


        /*
        a functional interface has exactly one abstract method.
        Since default methods have an implementation, they are not abstract.
        */

        numbers.stream()
                .filter(isOddPredicate)
                .map(CubeFunction)
                .forEach(printConsumer);

        numbers.stream()
                .filter(x-> x%2==0) // lambda expression
                .map(x-> x*x) //lambda expression
                .forEach(System.out::println); //method reference

    }

}
