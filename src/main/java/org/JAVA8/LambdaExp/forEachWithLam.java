package org.JAVA8.LambdaExp;

import java.util.Arrays;
import java.util.List;

public class forEachWithLam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Mango");
        list.forEach(fruits -> System.out.print(fruits+" "));
    }
}
