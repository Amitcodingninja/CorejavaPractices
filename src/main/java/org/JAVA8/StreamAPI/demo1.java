package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;

//Filter
public class demo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 10, 15, 20);
        list.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}
