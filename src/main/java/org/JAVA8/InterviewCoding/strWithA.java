package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;

//Count number of strings starting with "A" (case-insensitive)
public class strWithA {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amit", "aman", "aditya", "AnnA", "Dilip");
        long totalStartA = list
                .stream()
                .filter(s -> s.toUpperCase()
                .startsWith("A"))
                .count();
        System.out.println(totalStartA);
    }
}
