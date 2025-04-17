package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 2, 8, 1, 10, 3);
        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
    }
}
