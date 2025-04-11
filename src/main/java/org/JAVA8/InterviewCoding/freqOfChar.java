package org.JAVA8.InterviewCoding;

import java.util.Map;
import java.util.stream.Collectors;

//Count frequency of each character in a String
public class freqOfChar {
    public static void main(String[] args) {
        String input = "banana";
        Map<Character, Long> collect = input

                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c,
                        Collectors.counting()));
        System.out.println(collect);

    }

}
