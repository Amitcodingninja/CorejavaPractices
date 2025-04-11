package org.JAVA8.LambdaExp;

import java.util.function.BiFunction;

public class AddTwoNumByBiFun {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(4, 5));
    }
}
