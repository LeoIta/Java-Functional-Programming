package com.leoita.FP02_functional_interface.operators;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class _UnaryOperator_Other {
    public static void main(String[] args) {

        //<InputType>UnaryOperator
        IntUnaryOperator unaryIntOperator = a -> -1 * a;
        DoubleUnaryOperator unaryDoubleOperator = a -> -1 * a;
        LongUnaryOperator unaryLongOperator = a -> -1 * a;

    }

}
