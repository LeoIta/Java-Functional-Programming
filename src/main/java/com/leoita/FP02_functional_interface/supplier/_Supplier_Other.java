package com.leoita.FP02_functional_interface.supplier;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class _Supplier_Other {
    public static void main(String[] args) {

        //<OutputType>Supplier
        BooleanSupplier isOnSupplier= () -> true;
        IntSupplier maxSpeedSupplier = () -> 50;
        DoubleSupplier piSupplier = ()-> 3.14f;
        LongSupplier maxByteSizeSupplier = ()-> 3L*1024*1024*1024;

    }


}
