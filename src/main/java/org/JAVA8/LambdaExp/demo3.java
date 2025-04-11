package org.JAVA8.LambdaExp;

public class demo3 {
    public static void main(String[] args) {
        greet g = () -> {
            System.out.println("Hello");
        };
        g.greets();

        add a = (d, b) -> {
            return d + b;
        };

        int sum = a.sum(6, 9);
        System.out.println(sum);

        sub s = (x, y) -> {
            return x - y;
        };

        int sub = s.sub(72, 3);
        System.out.println(sub);

        mul m = (int y, int z) -> {
            return y * z;
        };
        int mul = m.mul(8, 5);
        System.out.println(mul);


        div v = (int y, int z) -> {
            return y/z;
        };
        int div = v.div(8, 4);
        System.out.println(div);
    }
}

@FunctionalInterface
interface greet {
    void greets();

}

interface add {
    int sum(int a, int b);
}

interface sub {
    int sub(int a, int c);
}
interface mul{
    int mul(int a,int b);
}
interface div{
    int div(int a,int b);
}