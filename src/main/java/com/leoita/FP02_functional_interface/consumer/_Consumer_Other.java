package com.leoita.FP02_functional_interface.consumer;

import java.util.List;
import java.util.Set;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;

public class _Consumer_Other {
    public static void main(String[] args) {

        //<InputType>Consumer
        IntConsumer intConsumer = a -> System.out.printf("selected value is %d%n", a);
        DoubleConsumer doubleConsumer = a -> System.out.printf("selected value is %f%n", a);
        LongConsumer longConsumer = a -> System.out.printf("selected value is %d%n", a);
        //Obj<SecondInputType>Consumer<FirstInputType>
        ObjIntConsumer<Double> objIntConsumer =
        (a,b) -> System.out.println(a/b);
        ObjDoubleConsumer<List<Integer>> objDoubleConsumer =
                (a,b) -> a.stream().map(val-> val* b).forEach(System.out::println);
        ObjLongConsumer<Set<Double>> objLongConsumer =
        (a,b) -> a.stream().map(val-> val/b).forEach(System.out::println);

        objIntConsumer.accept(3.0,2);
        objDoubleConsumer.accept(List.of(2,3,4), 3.0);
        objLongConsumer.accept(Set.of(6.0,9.0,0.66),2L);
    }
}
