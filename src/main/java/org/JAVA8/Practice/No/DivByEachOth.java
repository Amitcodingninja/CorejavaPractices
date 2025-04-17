package org.JAVA8.Practice.No;

import java.util.function.BiPredicate;

public class DivByEachOth {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isDivisible = (a, b) -> a % b == 0;

        int a = 20, b = 5;
        System.out.println(isDivisible.test(a, b));


    }
}
