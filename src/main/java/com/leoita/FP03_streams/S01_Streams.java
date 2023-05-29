package com.leoita.FP03_streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class S01_Streams {
    public static void main(String[] args) {

        //given a list
        List<Integer> integerList = List.of(9, 2, 1, 8, 5);
        /*
        using streams you create an abstraction of the list,
        it means that you pass from [9,2,1,8,5] to:
        9
        2
        1
        8
        5
        */
        Stream<Integer> integerStream = integerList.stream();
        //now you can work with elements in a more efficient way using operations.
        int sum = integerStream
                .filter(n -> n % 2 == 1) //intermediate Stream<T>
                .map(n -> n * n) //intermediate Stream<R>
                .sorted(Comparator.reverseOrder()) //intermediate Stream<T>
                .reduce(0, Integer::sum); //terminal T

        System.out.println(sum);
        /*
        in the example above the operations filter,map,sorted,limit are called
        intermediate operations as they take as input Stream<T> and return Stream<T>
        */

        /*
        in the example above the operation reduce is returning something different from
        Stream<T> and it is called terminal operations
        */


        /*
        please note that you cannot re-use a stream after a terminal operation, this is why you
        cannot reuse integerStream, but you have to create a new stream from the list
        integerList.stream()
         */

        integerList.stream()
//        integerStream
                .skip(1) //intermediate Stream<T>
                .limit(3) //intermediate Stream<T>
                .sorted() //intermediate Stream<T>
                .forEach(System.out::println); //terminal void

        /*
        if you try to use integerStream instead of integerList.stream() you'll get the below error:
        'Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed'
        */


    }
}
