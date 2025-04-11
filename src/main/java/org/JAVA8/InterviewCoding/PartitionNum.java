package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionNum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);
    }
}
