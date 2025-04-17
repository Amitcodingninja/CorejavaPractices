package org.JAVA8.Practice.No;

import java.util.function.BiFunction;

public class addTwoNum {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        int a = 23;
        int b = 40;

        System.out.println(add.apply(a, b));
    }
}
