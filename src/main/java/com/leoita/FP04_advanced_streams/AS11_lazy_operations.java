package com.leoita.FP04_advanced_streams;

import java.util.List;

public class AS11_lazy_operations {
    public static void main(String[] args) {
        List<String> names = List.of("Sam","Micheal","Paul",  "Peter", "Mark", "Tom");
        System.out.println(
                names.stream()
                        .peek(System.out::println) //Sam Michael
                        .filter(s -> s.length() > 3)
                        .peek(System.out::println) //Michael
                        .map(String::toUpperCase)
                        .peek(System.out::println) // MICHAEL
                        .findFirst()// MICHAEL
                        .orElse("Mike")
        );
        /*
        from the previous example we can see 1 demo of the lazy behavior of the intermediate
        operations
        - on 6 elements, only 2 are analyzed on 1st step as 2nd already matches the filter
        - the map operation maps only 1 value, 'Michael' that matches the filter
        - find first return an Optional of the only value inherited from the previous operation

        Doing this the Stream and the functional programming helps to save resources.
        */
        System.out.println("########################");
        System.out.println(names.stream()
                .peek(System.out::println)
                .filter(s -> s.length() > 2)
                .peek(System.out::println)
                .map(String::toLowerCase)); //java.util.stream.ReferencePipeline$3@448139f0

        /*
        In the example above, we have only intermediate operation. Without a terminal operation
        they do not work, they are lazy.
        */

    }
}
