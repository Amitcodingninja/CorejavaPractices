package org.JAVA8.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIDemo2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "shyam", "seeta");

        List<String> collect = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

    }
}
