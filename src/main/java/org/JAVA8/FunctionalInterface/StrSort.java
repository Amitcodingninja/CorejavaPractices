package org.JAVA8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class StrSort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Zebra", "Honey", "Girl", "Xmas");
//        names.sort((a, b) -> a.compareTo(b));Ascending Order
        names.sort((a, b) -> b.compareTo(a));
        System.out.println(names);
    }
}
