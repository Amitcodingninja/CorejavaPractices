package org.JAVA8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class FindMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 5, 1, 9, 10, 23);
        int max = list.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println(max);

    }

}
