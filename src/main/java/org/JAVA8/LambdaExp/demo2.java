package org.JAVA8.LambdaExp;

public class demo2 {
    public static void main(String[] args) {
        Mul m = (a, b) -> {
            return a * b;
        };
        int mul = m.mul(4, 5);
        System.out.println(mul);

        Sub s = (a, b) -> a - b;
        int sub = s.sub(5, 4);
        System.out.println(sub);


    }


    interface Mul {
        int mul(int a, int b);
    }

    interface Sub {
        int sub(int a, int b);
    }
}