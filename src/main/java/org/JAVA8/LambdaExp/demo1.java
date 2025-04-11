package org.JAVA8.LambdaExp;

public class demo1 {
    public static void main(String[] args) {
        A a = () -> System.out.println("Hello World");
        a.greet();

        B b = (x) -> {
            return x * x;
        };
        System.out.println(b.sq(4));

        C c = (d, e) -> {
            return d + e;

        };
        System.out.println(c.add(4, 5));


    }
}

interface A {
    void greet();
}

interface B {
    int sq(int a);
}

interface C {
    int add(int a, int b);
}