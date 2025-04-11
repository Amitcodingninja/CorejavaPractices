package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class map {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("john", "doe");
        names.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
