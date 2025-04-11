package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class sorts {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 3, 7, 1);
        nums.stream().sorted().forEach(System.out::println);
    }
}
