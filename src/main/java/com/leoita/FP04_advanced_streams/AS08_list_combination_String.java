package com.leoita.FP04_advanced_streams;

import java.util.List;
import java.util.stream.Collectors;

public class AS08_list_combination_String {
    public static void main(String[] args) {

        List<String> names = List.of("Paul", "Chris", "Peter", "Mark", "Tom");
        List<String> names2 = List.of("Paul", "Chris", "Peter", "Mark", "Tom");
        System.out.println("############### first list ###############\n" + names);
        System.out.println("############### second list ###############\n" + names2);
        List<List<String>> combineAll = names.stream()
                .flatMap(name ->
                        names2.stream().map(name2 -> List.of(name, name2)))
                .collect(Collectors.toList());
        System.out.println("########## Tuple of all elements##########\n" + combineAll);
        List<List<String>> combineWithoutDuplicate = names.stream()
                .flatMap(name ->
                        names2.stream().map(name2 -> List.of(name, name2)))
                .filter(list -> !list.get(0).equals(list.get(1)))
                .collect(Collectors.toList());
        System.out.println("########## Tuple without couple of same value##########\n" + combineWithoutDuplicate);

        List<List<String>> combineSameSize = names.stream()
                .flatMap(name ->
                        names2.stream()
                                .filter(name2-> name.length()==name2.length())
                                .map(name2 -> List.of(name, name2)))
                .filter(list -> !list.get(0).equals(list.get(1)))
                .collect(Collectors.toList());
        System.out.println("########## Tuple with same length##########\n" + combineSameSize);


    }
}
