package org.JAVA8.FunctionalInterface;

import java.util.function.Supplier;
// Taking Nothing returning one value
//Supplier<T>	None	T	Supplies value

public class Supplier1 {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}
