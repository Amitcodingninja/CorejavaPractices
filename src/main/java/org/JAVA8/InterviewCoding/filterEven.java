package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 10, 12, 8, 16);

        List<Integer> collect = list
                .stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
