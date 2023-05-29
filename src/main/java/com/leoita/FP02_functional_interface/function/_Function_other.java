package com.leoita.FP02_functional_interface.function;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntBiFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class _Function_other {
    public static void main(String[] args) {

        //<InputType>Function<OutputType>
        IntFunction<Long> stringIntFunction;
        DoubleFunction<Long> stringDoubleFunction;
        LongFunction<Long> stringLongFunction;

        //<OutputType>Function<InputType>
        ToDoubleFunction<Integer> toDoubleFunction;
        ToLongFunction<Integer> toLongFunction;
        ToIntFunction<Integer> toIntFunction;

        //<OutputType>BiFunction<InputType>
        ToDoubleBiFunction<Integer, Integer> toDoubleBiFunction;
        ToLongBiFunction<Integer, Integer> toLongBiFunction;
        ToIntBiFunction<Integer, Integer> toIntBiFunction;

        // <InputType>To<OutputType>Function
        IntToDoubleFunction intToDoubleFunction;
        IntToLongFunction intToLongFunction;
        DoubleToIntFunction doubleToIntFunction;
        DoubleToLongFunction doubleToLongFunction;
        LongToDoubleFunction longToDoubleFunction;
        LongToIntFunction longToIntFunction;
    }

}
