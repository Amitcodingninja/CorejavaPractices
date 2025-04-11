package org.JAVA8.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class revSort {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9, 3, 7, 1,1);

        Stream<Integer> sorted1 = nums.
                stream().
                sorted(Comparator.reverseOrder());
        System.out.println(sorted1.toList());

    }
}
