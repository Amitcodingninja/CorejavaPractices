package org.JAVA8.FunctionalInterface;

import java.util.function.Predicate;

public class StrStartWithA {
    public static void main(String[] args) {
        Predicate<String> strWithA = s -> s.startsWith("A");

        System.out.println(strWithA.test("Apple"));
    }
}
