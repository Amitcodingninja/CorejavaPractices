package org.JAVA8.Practice;

interface A {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    default int mul(int a, int b) {
        return a * b;
    }
}

interface  B extends  A {

}


public class defansStat implements  B {
    public static void main(String[] args) {
//        defansStat d = new defansStat();
//        int mul = d.mul(2, 4);
//        System.out.println(mul);
//        int min = 100000;
//        int max = 999999;
//        int randomSixDigit = (int)(Math.random() * (max - min + 1)) + min;
//        System.out.println(randomSixDigit);

        int random = 1000 + (int)(Math.random() * 9000);
        System.out.println(random);
    }
}
