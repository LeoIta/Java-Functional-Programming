package com.leoita.FP02_functional_interface.supplier;

import java.util.Set;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {

        Supplier<Set<String>> webUrlSupplier = () -> Set.of("www.site1.com","www.site2.com");
        System.out.println(webUrlSupplier.get());
    }


}
