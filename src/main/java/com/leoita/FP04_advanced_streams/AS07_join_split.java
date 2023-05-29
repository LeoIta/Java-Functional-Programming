package com.leoita.FP04_advanced_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AS07_join_split {
    public static void main(String[] args) {

        System.out.println("########STARTING LIST######");
        List<String> names = List.of("Paul","Chris","Peter", "Mark", "Tom");
        System.out.println(names);
        //JOIN TO String
        System.out.println("########JOIN TO STRING######");
        String joinFromList = names.stream().collect(Collectors.joining(","));
        System.out.println(joinFromList);
        //SPLIT from String
        System.out.println("########SPLIT LIST ELEMENT USING ONLY MAP######");
        Stream<String[]> streamOfArrays = names.stream().map(e -> e.split(""));
        List<String[]> mapSplitList = streamOfArrays.collect(Collectors.toList());
        System.out.println(mapSplitList);
        // [[Ljava.lang.String;@682a0b20, [Ljava.lang.String;@3d075dc0, [Ljava.lang.String;@214c265e, [Ljava.lang.String;@448139f0, [Ljava.lang.String;@7cca494b]
        //we do have the expected results
        System.out.println("########SPLIT LIST ELEMENT USING FLATMAP######");
        Stream<String> stringStream = names.stream().map(e -> e.split("")).flatMap(Arrays::stream);
        List<String> stringList = stringStream.collect(Collectors.toList());
        System.out.println(stringList);

    }
}
