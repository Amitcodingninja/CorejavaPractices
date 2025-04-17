package org.Revisions;

public class IntEg implements B {
    public static void main(String[] args) {
//        IntEg e = new IntEg();
//        e.add();
//
//        System.out.println(B.sub());

        for (int i = 1 ; i<=10; i++){
            System.out.println(5*i);
        }
    }
}

interface A {
    default void add() {
        System.out.println(2 + 3);

    }
}

interface B extends A {
    static int sub() {

        return 4 - 3;
    }

    default void mul() {
        System.out.println(2 * 3);

    }


}