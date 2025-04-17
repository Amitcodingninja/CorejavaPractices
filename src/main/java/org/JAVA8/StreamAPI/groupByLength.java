package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class groupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "car", "elephant", "dog");

        Map<Integer, List<String>> collect =
                words.stream()
                        .collect(Collectors.groupingBy(x -> x.length()));
        System.out.println(collect);

    }
}
