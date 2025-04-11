package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenListOfList {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );

        List<Integer> collect = list.stream().flatMap(l -> l.stream()).collect(Collectors.toList());
        System.out.println(collect);


    }
}
