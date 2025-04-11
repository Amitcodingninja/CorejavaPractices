package org.JAVA8.LambdaExp;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FilterEven {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 5, 8, 0, 6);
//        List<Integer> even = list.stream().filter(n -> n % 2 == 0)
//                .collect(Collectors.toList());
////                .toList();
//
//        System.out.println(even);

        list.forEach(n-> System.out.print(n*n +" "));
        System.out.println();

        Function<String ,Integer> strlen=str->str.length();
        System.out.println(strlen.apply("Amit"));

    }
}
