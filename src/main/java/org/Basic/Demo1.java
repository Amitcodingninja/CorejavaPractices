package org.Basic;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 d = new Demo1();
        int add = d.add(3, 5);
        System.out.println(add);
        int sub = Demo1.sub(3, 4);
        System.out.println(sub);

        d.print();

    }

    public int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public void print(){
        System.out.println("Hello");
    }
}
