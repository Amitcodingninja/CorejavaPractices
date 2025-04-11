package org.JAVA8.FunctionalInterface;

import java.util.function.Predicate;

//Predicate<T> Example
//Predicate<T>	T(input)	boolean(return)	Condition check(Desc)
public class predicate {
    public static void main(String[] args) {
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(7));


    }

}
