package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class maxAndMin {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 99, 12, 7, 101);
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect.getFirst() + " " + collect.getLast());

    }
}
