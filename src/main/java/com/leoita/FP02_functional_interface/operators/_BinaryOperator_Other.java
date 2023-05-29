package com.leoita.FP02_functional_interface.operators;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class _BinaryOperator_Other {

    //<InputTypeOf2Arguments>BinaryOperator return instance of <InputTypeOf2Arguments>
    IntBinaryOperator intBinaryOperator = (a, b) -> (a >= b) ? a-b : b-a; //same of BinaryOperator<Integer>

    DoubleBinaryOperator doubleBinaryOperator = (a, b) -> (a >= b) ? a-b : b-a; //same of BinaryOperator<Double>

    LongBinaryOperator longBinaryOperator = (a, b) -> (a >= b) ? a-b : b-a; //same of BinaryOperator<Long>

}
