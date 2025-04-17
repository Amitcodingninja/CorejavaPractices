package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mergeList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );

        List<Integer> collect = listOfLists.stream().flatMap(List -> List.stream()).collect(Collectors.toList());
        System.out.println(collect);

    }
}
