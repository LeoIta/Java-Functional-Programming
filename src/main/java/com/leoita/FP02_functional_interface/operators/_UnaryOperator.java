package com.leoita.FP02_functional_interface.operators;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class _UnaryOperator {
    public static void main(String[] args) {

        UnaryOperator<Integer> unaryIntOperator = a -> -1 * a;
        UnaryOperator<Boolean> unaryBoolOperator = a -> !a;
        System.out.println(unaryIntOperator.apply(3));
        System.out.println(unaryBoolOperator.apply(true));
        Function<Integer,Boolean> a = unaryIntOperator.andThen(z-> z%2==0);
        var compose = unaryIntOperator.compose(x -> (x instanceof Boolean)?1:0);
        System.out.println(compose.apply(true));
    }

}
