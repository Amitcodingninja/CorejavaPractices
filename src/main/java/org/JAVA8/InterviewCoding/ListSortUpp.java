package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//4. Convert List<String> to uppercase and sort them
public class ListSortUpp {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("raj", "amit", "Zara");
        List<String> collect = names.stream().map(s -> s.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println(collect);

    }
}
