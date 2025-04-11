package org.JAVA8.LambdaExp;

import java.util.function.Consumer;

//Advanced Concept Passing Lambda as Parameter
public class lambdaWithPara {
    public static void main(String[] args) {
        printMess("Amit Rocks", m -> System.out.println(m.toUpperCase()));

    }

    public static void printMess(String message, Consumer<String> func) {
        func.accept(message);
    }
}
