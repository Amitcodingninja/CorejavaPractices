package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Find palindromes in a list of strings
public class findPalindromInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("madam", "racecar", "hello");
        List<String> collect = list.stream().
                filter(word -> isPalindrome(word))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    private static boolean isPalindrome(String word) {
        return word
                .equalsIgnoreCase(new StringBuilder(word)
                        .reverse()
                        .toString());
    }
}
