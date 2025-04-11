package org.JAVA8.InterviewCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fibdDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
//        list.stream().filter(count ->count >1).collect(Collectors.groupingBy(Collectors.toMap(count ->count)));


        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();
        for(int i : list){
            if (!seen.add(i)){
                duplicates.add(i);
            }
        }
        System.out.println(duplicates);
    }
}
