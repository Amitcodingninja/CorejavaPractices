package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//2. Square each number and remove duplicates
public class sqOfNoAndRemDup {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 4, 3, 10, 5, 10, 12, 8, 16);
        List<Integer> collect = list
                .stream()
                .map(x -> x * x)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect);

    }
}
