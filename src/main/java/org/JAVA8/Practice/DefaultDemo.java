package org.JAVA8.Practice;

public class DefaultDemo implements mul {
    public static void main(String[] args) {

        DefaultDemo d = new DefaultDemo();
        int muls = d.mul(4, 5);
        System.out.println(muls);

        System.out.println(d.add());

        int sub = mul.sub();
        System.out.println(sub);


    }

    @Override
    public int add() {
        return 4 + 8;
    }
}


interface mul {

    int add();

    default int mul(int a, int b) {
        return a * b;
    }

    static int sub() {
        return 8 - 4;
    }
}