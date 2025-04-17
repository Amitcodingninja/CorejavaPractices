package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class EvenSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 6, 8, 5, 10, 13);
        int reduce = numbers
                .stream()
                .filter(x -> x % 2 == 0)
                .reduce(0,(a, b) -> a + b);
        System.out.println(reduce);

    }
}
