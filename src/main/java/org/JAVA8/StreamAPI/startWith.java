package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class startWith {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ravi", "Sneha", "Amit", "Sagar", "Neha");
        List<String> s = names.stream().filter(name -> name.startsWith("S")).toList();
        System.out.println(s);


    }
}
