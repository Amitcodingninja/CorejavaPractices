package org.JAVA8.FunctionalInterface;

import java.util.function.Consumer;

public class Consumer1 {
    public static void main(String[] args) {
        Consumer<String> printName = name -> System.out.println("Hello " + name);
        printName.accept("Amit");
    }
}
