package com.leoita.FP02_functional_interface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FI03_Lambda_MethodReference {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 2, 3, 7, 9);
        record Amount(int value) {
        }

        //standard methods
        System.out.println("#######stndard methods#########");
        numbers.stream()
                .filter(n -> isOdd(n))
                .map(n -> duplicate(n))
                .map(n -> new Amount(n))
                .forEach(a -> System.out.println(a));
        /*
        LAMBDAS
        lambda are methods defines without a name, these methods can be saved as variable
        */
        System.out.println("#######lambdas#########");
        Predicate<Integer> isOddPredicate = n -> n % 2 == 1;
        Function<Integer, Integer> DuplicateFunction = n -> n * 2;
        Function<Integer, Amount> amountFunction = n -> new Amount(n);
        Consumer<Amount> amountConsumer = a -> System.out.println(a);
        numbers.stream()
                .filter(isOddPredicate)
                .map(DuplicateFunction)
                .map(amountFunction)
                .forEach(amountConsumer);

        /*
        METHOD REFERENCES
        Method reference replaces the call to a method when all the inputs are passed as arguments of the method
        Using method reference you can call:
        - methods from another class => 'System.out::println'
        - methods from the same class =>  'FI03_Lambda_MethodReference::duplicate'
        - constructors of other objects =>  'Amount::new'
        */
        System.out.println("#######method reference#########");
        numbers.stream()
                .filter(FI03_Lambda_MethodReference::isOdd)
                .map(FI03_Lambda_MethodReference::duplicate)
                .map(Amount::new)
                .forEach(System.out::println);
    }

    private static Integer duplicate(Integer number) {
        return number * 2;
    }

    private static boolean isOdd(Integer number) {
        return number % 2 == 1;
    }
}