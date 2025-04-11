package org.JAVA8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class sortNum {
    public static void main(String[] args) {
        List<String> num = Arrays.asList("Zebra","Dilip","Ivanka","Cat");
        num.sort((a , b)->b.compareTo(a));
        System.out.println(num);
    }
}
