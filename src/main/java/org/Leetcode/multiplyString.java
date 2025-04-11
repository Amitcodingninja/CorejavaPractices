package org.Leetcode;

import java.math.BigInteger;

public class multiplyString {
    public static void main(String[] args) {

        String num1 = "4";
        String num2 = "5" ;

        System.out.println(multiply(num1 , num2));
        System.out.println(multiply1(num1 , num2));

    }

    public static String multiply(String num1, String num2) {
     long i1 =Long.parseLong(num1);
        long i2 = Long.parseLong(num2);

        long total=i1*i2;

        String s = String.valueOf(total);

        return s;


    }

    public static String multiply1(String num1, String num2){
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger multiply = n1.multiply(n2);

        return multiply.toString();


    }


}
