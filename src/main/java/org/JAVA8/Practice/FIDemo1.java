package org.JAVA8.Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FIDemo1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        numbers.stream().filter(x->x%2==0).forEach(System.out::println);
        List<Integer> collect = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);


    }
}
