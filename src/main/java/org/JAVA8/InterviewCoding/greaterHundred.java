package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find the first element greater than 100
public class greaterHundred {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 25, 150, 90, 200);
        List<Integer> collect = list
                .stream()
                .filter(n -> n > 100)
                .sorted().limit(1)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
