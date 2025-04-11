package org.JAVA8.FunctionalInterface;

import java.util.function.Function;

// Taking 2 Input returning 1 Output
//Function<T,R>	T	R	Transformation
public class Function1 {
    public static void main(String[] args) {
        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("Amit"));
    }
}
