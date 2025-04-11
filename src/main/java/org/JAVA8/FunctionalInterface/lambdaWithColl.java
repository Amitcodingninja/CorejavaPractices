package org.JAVA8.FunctionalInterface;

import java.util.Arrays;
import java.util.List;

public class lambdaWithColl {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Sakshi", "Monu", "Pankaj", "Amit");
        name.sort((a, b) -> a.compareTo(b));
        System.out.println(name);

        List<Integer> num = Arrays.asList(2, 5, 1, 7, 3, 4, 0);
        num.sort((a, b) -> a - b);
        System.out.println(num);

        List<Character> ch = Arrays.asList('a', 'd', 'c', 'b', 'f', 'e');
        ch.sort((a, b) -> a.compareTo(b));
        System.out.println(ch);

        List<Double> f = Arrays.asList(2.3, 1.1, 7.1);
        f.sort((a, b) -> (int) (a - b));
        System.out.println(f);

    }
}
