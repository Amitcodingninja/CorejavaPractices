package org.TwoDArray;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
        int fibonacci = fib1(n);
        System.out.println(fibonacci);

    }

    public static  int fib1(int fib){
        if (fib==0){
            return  0;
        } else if (fib == 1) {
            return  1;
        }

        return fib1(fib-1) + fib1(fib-2);
    }
}
