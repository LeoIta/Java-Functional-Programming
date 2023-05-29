package com.leoita.FP04_advanced_streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AS14_Files {

    public static void main(String[] args) throws IOException {
        Stream<String> content = Files.lines(Paths.get("file.txt"));
        System.out.println(content.collect(Collectors.toList()));
        Files.lines(Paths.get("file.txt"))
                .map(text-> text.split(" "))
                .flatMap(Arrays::stream)
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);


        Files.list(Paths.get("."))
                .filter(Files::isRegularFile)
                .forEach(System.out::println);
    }
}
