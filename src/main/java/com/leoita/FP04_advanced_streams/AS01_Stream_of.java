package com.leoita.FP04_advanced_streams;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AS01_Stream_of {

    @SuppressWarnings("unused")
    public static void main(String[] args) {

        List<Integer> numbersFromList = List.of(10, 29, 12, 2, 5, 1);

        Stream<Integer> stream = numbersFromList.stream();
        System.out.println(stream);
        // java.util.stream.ReferencePipeline$Head@eed1f14

        Stream<Integer> numbersFromStream = Stream.of(10, 29, 12, 2, 5, 1);
        System.out.println(numbersFromStream);
        //java.util.stream.ReferencePipeline$Head@7229724f

        /*
        note that ReferencePipeline means a stream of wrapped element
        If you need to use the summaryStatistics operations like
        sum(), min(), max(),average() etc. you need an intermediate step
        to unwrap the elements of the Stream
        */

//        stream.mapToInt(Integer::intValue).sum();
//        stream.mapToInt(Integer::intValue).average();
//        stream.mapToInt(Integer::intValue).max();
//        stream.mapToInt(Integer::intValue).min();
        IntSummaryStatistics statistics = stream.mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(statistics);

        int[] numberArray = {10, 29, 12, 2, 5, 1};
        IntStream streamFromArray = Arrays.stream(numberArray);
        System.out.println(streamFromArray);
        //java.util.stream.IntPipeline$Head@3941a79c
        //no intermediate step is required as here we use a primitive stream
        System.out.println(streamFromArray.summaryStatistics());
    }
}
