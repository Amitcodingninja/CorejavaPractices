package org.JAVA8.LambdaExp;

import java.util.function.Function;

public class retLamFromMet {
    public static void main(String[] args) {
        Function<Integer, Integer> square = square();
        System.out.println(square.apply(5));

    }

    public static Function<Integer, Integer> square() {
        return a -> a * a;
    }
}
